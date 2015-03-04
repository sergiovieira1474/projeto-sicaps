/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atendimento;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author henri
 */
public class PacienteTableModal extends AbstractTableModel{
    
    
    private String[] pacienteColunas = {"Codigo", "Nome", "CPF", "Cartao do SUS"};
    List<Paciente> pacientes = new ArrayList<Paciente>();

    public PacienteTableModal(List<Paciente> paciente) {
        this.pacientes.clear();
        this.pacientes.addAll(paciente);
    }

    @Override
    public int getRowCount() {
        return pacientes.size();
    }

    @Override
    public int getColumnCount() {
        return pacienteColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paciente paciente = pacientes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return paciente.getIdPaciente();
            case 1:
                return paciente.getNomePeciente();
            case 2:
                return paciente.getCPF();
            case 3:
                return paciente.getCartaoSUS();
        }
        return null;
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return pacienteColunas[0];
            case 1:
                return pacienteColunas[1];
            case 2:
                return pacienteColunas[2];
            case 3:
                return pacienteColunas[3];

        }
        return null;
    }
    
    
}
