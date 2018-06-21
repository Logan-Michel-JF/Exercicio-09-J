
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
    public JLabel jLabelNome, jLabelIdade, jLabelApelido, jLabelPreco, jLabelDescricao, jLabelRaca;
    public JScrollPane jScrollPane;
    public JButton jButtonSalvar, jButtonCancelar;
    public JCheckBox jCheckBoxAdestrado, jCheckBoxCastrado, jCheckBoxVacinado, jCheckBoxPedigree;
    public JComboBox jComboBoxRaca;
    public DefaultComboBoxModel jComboBoxModelRaca;
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
            definirObjetoComboBox();
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
        jLabelIdade = new JLabel("Idade");
        jTextFieldIdade = new JTextField();
        jLabelRaca = new JLabel("Raça");
        jComboBoxRaca = new JComboBox();
        jLabelApelido = new JLabel("Apelido");
        jTextFieldApelido = new JTextField();
        
    }
        
    @Override
    public void adicionarComponetes() {
        jFrame.add(jLabelNome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jLabelIdade);
        jFrame.add(jTextFieldIdade);
        jFrame.add(jComboBoxRaca);
        jFrame.add(jLabelApelido);
        jFrame.add(jTextFieldApelido);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10 , 5);
        jTextFieldNome.setLocation(10, 30);
        jLabelIdade.setLocation(396, 5);
        jTextFieldIdade.setLocation(396, 30);
        jLabelRaca.setLocation(10, 80);
        jComboBoxRaca.setLocation(10, 85);
        jLabelApelido.setLocation(187, 80);
        jTextFieldApelido.setLocation(187, 95);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(50, 20);
        jTextFieldNome.setSize(342, 21);
        jLabelIdade.setSize(396, 30);
        jTextFieldIdade.setSize(193, 21);
        jLabelRaca.setSize(50, 20);
        jComboBoxRaca.setSize(150, 20);
        jLabelApelido.setSize(50, 20);
        jTextFieldApelido.setSize(165, 20);
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

    @Override
    public void definirObjetoComboBox() {
        DefaultComboBoxModel jComboBoxModelRaca = new DefaultComboBoxModel(
            new Object[]{
                    "PittBull" , "Dalmata" , "Pastor-Alemão" , "Labrador" , "Buldog", 
                    "Poodle" , "Beagle" , "Golden Retriever" , "Chihuahua" , "Pug"
                
            });
        jComboBoxRaca.setModel(jComboBoxModelRaca);
        jComboBoxRaca.setSelectedIndex(-1);
        
    }
    
}
