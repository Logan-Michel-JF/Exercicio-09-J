
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 * @author Logan Michel
 */
public class Exercicio00 implements JFrameBaseInterface{
    
    public JFrame jFrame;
    public JTextArea jTextArea;
    public JLabel jLabelDescricao;
    public JScrollPane jScrollPane;
    public JButton jButtonSalvar, jButtonCancelar;
    public JCheckBox jCheckBoxAdestrado, jCheckBoxCastrado, jCheckBoxVacinado, jCheckBoxPedigree;
    public JComboBox jComboBox;
    public JRadioButton jRadioButtonVivo, jRadioButtonMorto, jRadioButtonRacao, jRadioButtonComeAlmocoEJanta;
    
    
    public Exercicio00(){
            gerarTela();
            instanciarComponentes();
            gerarDimensoes();
            gerarLocalizacoes();
            adicionarComponetes();
            definirRadioParaButtonGroup();
            acaoBotaoSalvar();
            acaoBotaoCancelar();
            configurarJScrollPane();
            jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(616, 422);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void adicionarComponetes() {
        jFrame.add(jLabelDescricao);
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonCancelar);
        jFrame.add(jCheckBoxAdestrado);
        jFrame.add(jCheckBoxCastrado);
        jFrame.add(jCheckBoxVacinado);
        jFrame.add(jCheckBoxPedigree);
        jFrame.add(jRadioButtonVivo);
        jFrame.add(jRadioButtonMorto);
        jFrame.add(jRadioButtonRacao);
        jFrame.add(jRadioButtonComeAlmocoEJanta);
        jFrame.add(jLabelDescricao);
        jFrame.add(jScrollPane);
    }

    @Override
    public void instanciarComponentes() {
    }

    @Override
    public void gerarLocalizacoes() {
    }

    @Override
    public void gerarDimensoes() {
    }

    @Override
    public void definirRadioParaButtonGroup() {
    }

    @Override
    public void acaoBotaoSalvar() {
    }

    @Override
    public void acaoBotaoCancelar() {
    }

    @Override
    public void configurarJScrollPane() {
    }
    
}
