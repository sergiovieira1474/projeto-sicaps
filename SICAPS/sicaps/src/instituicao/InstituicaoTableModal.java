/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instituicao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sergio
 */
public class InstituicaoTableModal extends AbstractTableModel{
    
    private String[] institucaoColunas = {"Nome","Nome Fantasia"};
    List<Instituicao> instituicaos = new ArrayList<Instituicao>();
    
    public InstituicaoTableModal(List<Instituicao> instituicao) {
        this.instituicaos.clear();
        this.instituicaos.addAll(instituicao);

    }

    @Override
    public int getRowCount() {
        return instituicaos.size();
    }

    @Override
    public int getColumnCount() {
        return institucaoColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Instituicao instituicao = instituicaos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return instituicao.getIdInstituicao();
            case 1:
                return instituicao.getNomeInstituicao();
            case 2:
                return instituicao.getNomeFantasia();
            
    }
    return null;
    }
     
    
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return institucaoColunas[0];
            case 1:
                return institucaoColunas[1];
            case 2:
                return institucaoColunas[2];
            

        }
        return null;
    }
}
