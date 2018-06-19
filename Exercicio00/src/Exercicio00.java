
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
import javax.swing.JTextField;


/**
 * @author Logan Michel
 */
public class Exercicio00 implements JFrameBaseInterface{
    
    public JFrame jFrame;
    public JTextArea jTextDescricao;
    public JTextField jTextFieldNome, jTextFieldIdade, jTextFieldApelido, jTextFieldPreco;
    public JLabel jLabelNome, jLabelIdade, jLabelApelido, jLabelPreco;
    public JScrollPane jScrollPane;
    public JButton jButtonSalvar, jButtonCancelar;
    public JCheckBox jCheckBoxAdestrado, jCheckBoxCastrado, jCheckBoxVacinado, jCheckBoxPedigree;
    public JComboBox jComboBoxRaca;
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
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jTextFieldNome = new JTextField();
    }
        
    @Override
    public void adicionarComponetes() {
        jFrame.add(jLabelNome);
        jFrame.add(jTextFieldNome);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10 , 5);
        jTextFieldNome.setLocation(10, 30);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(50, 20);
        jTextFieldNome.setSize(350, 20);
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
