/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_chu;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import static interface_chu.Newjson.createjson;
import static interface_chu.Newjson.testLinux;
import java.util.ArrayList;
import java.util.Map;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import java.util.function.UnaryOperator;
import javafx.scene.control.TextFormatter;
/**
 *
 * PUCHEU Marion
 * MARLIAT Julien
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML final FileChooser fileChooser = new FileChooser();
    
    private boolean replayok;
    private ToggleGroup monGroupe;
    @FXML private RadioButton microbiome, resistome;
    @FXML private Button fichier;
    @FXML private Button classifier;
    @FXML private Button classifierpath;
    @FXML private Button classifiertaxon;
    @FXML private Button meta;
    @FXML private Button resu;
    @FXML private Button valid;
    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;
    @FXML private Button button5;
    @FXML private Button boutonFichierTab;
    @FXML private Button boutonAdd;
    @FXML private Button start;
    @FXML private Button addCouple;
   
    @FXML private CheckBox variant_prema;
    @FXML private CheckBox variant_callvar;
    @FXML private CheckBox variant_merge;
    @FXML private CheckBox variant_gentable;
    @FXML private CheckBox variant_genref;
    @FXML private CheckBox rarefy;
    @FXML private CheckBox phylogeny_iqtre;
    @FXML private CheckBox diversity_alpha;
    @FXML private CheckBox alpha_group_significance;
    @FXML private CheckBox diversity_beta;
    @FXML private CheckBox beta_group_significance;
    @FXML private CheckBox emperor_plot;
    @FXML private CheckBox alpha_rarefaction;
    @FXML private CheckBox classify_sklearn;
    @FXML private CheckBox filter_samples;
    @FXML private CheckBox taxa_collapse;
    @FXML private CheckBox filter_features;
    @FXML private CheckBox ancom;
    @FXML private CheckBox export_trimmed;
    @FXML private CheckBox classify_samples_ncv;
    @FXML private CheckBox picrust2_pipeline;
    @FXML private CheckBox picrust2_import;
    @FXML private CheckBox export_table;
    @FXML private CheckBox stats_depth;
    @FXML private CheckBox lefse;
    @FXML private CheckBox humann2_merge;
    @FXML private CheckBox maaslin2;
    @FXML private CheckBox humann2;
    @FXML private CheckBox bwrap;
    @FXML private CheckBox metaphlan2;
    @FXML private CheckBox metaphlan2_merge;
    @FXML private CheckBox metaphlan2_export;
    
    @FXML private Label lbbwrap;
    @FXML private Label lvariant_prema;
    @FXML private Label lvariant_callvar;
    @FXML private Label lvariant_merge;
    @FXML private Label lvariant_gentable;
    @FXML private Label lvariant_genref;
    @FXML private Label lrarefy;
    @FXML private Label lphylogeny_iqtre;
    @FXML private Label ldiversity_alpha;
    @FXML private Label lalpha_group_significance;
    @FXML private Label ldiversity_beta;
    @FXML private Label lbeta_group_significance;
    @FXML private Label lemperor_plot;
    @FXML private Label lalpha_rarefaction;
    @FXML private Label lclassify_sklearn;
    @FXML private Label lfilter_samples;
    @FXML private Label ltaxa_collapse;
    @FXML private Label lfilter_features;
    @FXML private Label lancom;
    @FXML private Label lexport_trimmed;
    @FXML private Label lclassfy_samples_ncv;
    @FXML private Label lpicrust2_pipeline;
    @FXML private Label lpicrust2_import;
    @FXML private Label lexport_table;
    @FXML private Label lstats_depth;
    @FXML private Label llefse;
    @FXML private Label lhumann2_merge;
    @FXML private Label lmaaslin2;
    @FXML private Label lmetaphlan2_merge;
    @FXML private Label lmetaphlan2_export;
    @FXML private Label lhumann2;
    @FXML private Label labelDico;
    
    
    @FXML private Text nomModule;
    @FXML private Text para1;
    @FXML private Text para2;
    @FXML private Text para3;
    @FXML private Text para4;
    @FXML private Text para5;
    @FXML private Text frontforward;
    @FXML private Text frontreverse;
    @FXML private Text errorTField1;
    @FXML private Text errorTField2;
    @FXML private Text errorTField3;
    @FXML private Text errorTField4;
    @FXML private Text errorTField5;
    @FXML private Text errorOverlap;
    @FXML private Text errorTruncateForward;
    @FXML private Text errorTruncateReverse;
    @FXML private Text errorPercentageIdentity;
    
    @FXML private TextField le1;
    @FXML private TextField le2;
    @FXML private TextField le3;
    @FXML private TextField le4;
    @FXML private TextField le5;
    @FXML private TextField frontforwardtxt;
    @FXML private TextField frontreversetxt;
    @FXML private TextField primerforwardtxt;
    @FXML private TextField primerreversetxt;
    @FXML private TextField truncateforwardtxt;
    @FXML private TextField truncatereversetxt;
    @FXML private TextField anywhereforwardtxt;
    @FXML private TextField anywherereversetxt;
    @FXML private TextField overlaptxt;
    @FXML private TextField percentagetxt;
    @FXML private TextField f_primertxt;
    @FXML private TextField f_primer_name_txt;
    @FXML private TextField r_primertxt;
    @FXML private TextField r_primer_name_txt;
    @FXML private TextField jsonfilename;
    @FXML private TextField coupleVal1;
    @FXML private TextField coupleVal2;
    @FXML private TextArea ctrl;
    
    @FXML private Label label1;
    @FXML private Label label2;
    @FXML private Label label3;
    @FXML private Label label4;
    @FXML private Label label5;
    @FXML private Label classif;
    @FXML private Label nomfichiers;
    @FXML private Label fmeta; 
    @FXML private Label fresu;
    @FXML private Label classifpath;
    @FXML private Label classiftaxon;
    
    @FXML private AnchorPane paneDetails;
    @FXML private AnchorPane listeChoix;
    @FXML private AnchorPane paneTableCouple;
    
    @FXML private TableView listeChoixTab;
    @FXML private TableView tableCouple;
    @FXML private TableColumn <Choix, String> colChoix;
    @FXML private TableColumn <Choix, String> colCoupleVal1;
    @FXML private TableColumn <Choix, String> colCoupleVal2;
    
    private ObservableList<Choix> listChoix;
    private ObservableList<Choix> listChoixCouple1;
    private ObservableList<Choix> listChoixCouple2;
    
    private String valueModule;
    private String mustInt = "Must be an Integer";
    private String mustDouble = "Must be a Real (decimal or integer)";
    private String mustString = "Must be a String";
    
    private String min_sampling_depth;
    private Map<String, Object> listeModules;
    private HashMap<String, Object> listeModulesDico;
    private HashMap<String, Object> innerMapCLASSIFIER;
    
    private int nbrR1=0;
    private int nbrR2=0;
    
    
    //Si le choix de relancer une analyse est fait

    public boolean isReplayok() {
        return replayok;
    }

    public void setReplayok(boolean replayok) {
        this.replayok = replayok;
    }

    public Map<String, Object> getListeModules() {
        return listeModules;
    }

    public void setListeModules(Map<String, Object> listeModules) {
        this.listeModules = listeModules;
    }
    
    /**
     * vérifie qu'un string est bien un entier
     * @param chaine
     * @return 
     */
    public static boolean isInt(String chaine){
        boolean valeur = true;
        char[] tab = chaine.toCharArray();

        for(char carac : tab){
            if(!Character.isDigit(carac) && valeur){ 
                valeur = false; 
                break;
            } 
        }

        return valeur;
    }
    
    /**
     * vérifer qu'un sting est un nombre décimal
     */
    public static boolean isValidFloat(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;		
    }
    
    /**
     * fonction qui appelle le hashmap quand on clique sur ajouter
     */
    @FXML
    public void handleClickSave(ActionEvent event){
        HashMap<String, Integer>innerMap = new HashMap<>();
        HashMap<String, String>innerMapString = new HashMap<>();
        HashMap<String, Double>innerMapDouble = new HashMap<>();
        HashMap<String, Object>innerMapObject = new HashMap<>();
        switch (valueModule){
            case "rarefy" :
                if (isInt(le5.getText())){
                    errorTField5.setText("");
                    innerMap.put("todo", 1);
                    Integer val = Integer.parseInt(le5.getText());
                    innerMap.put("min_sampling_depth", val);
                    listeModules.put("rarefy", innerMap);
                }else{
                    errorTField5.setText(mustInt);
                }
                break;
            
            case "phylogeny_iqtree" :
                if (isInt(le2.getText())){
                    if (isValidFloat(le3.getText())){
                        if (isInt(le4.getText())){
                            if (isInt(le5.getText())){
                                errorTField5.setText("");
                                errorTField4.setText("");
                                errorTField3.setText("");
                                errorTField2.setText("");
                                innerMapObject.put("todo", 1);
                                innerMapObject.put("mode", (le1.getText()));
                                innerMapObject.put("perturb_nni_strength", Double.valueOf(le3.getText()));
                                innerMapObject.put("stop_iter", Integer.parseInt(le5.getText()));
                                innerMapObject.put("bootstrap_replicates", Integer.parseInt(le2.getText()));
                                innerMapObject.put("n_cores", Integer.parseInt(le4.getText()));
                                listeModules.put("phylogeny_iqtree", innerMapObject);
                            }else{
                                errorTField5.setText(mustInt);
                            }
                        }else{
                            errorTField4.setText(mustInt);
                        }
                    }else{
                        errorTField3.setText(mustDouble);
                    }
                }else{
                    errorTField2.setText(mustInt);
                }
                            
                break;
                
            case "alpha_rarefaction":
                if (isInt(le5.getText())){
                    errorTField5.setText("");
                    innerMap.put("todo", 1);
                    innerMap.put("max_depth", Integer.parseInt(le5.getText()));
                    listeModules.put("alpha_rarefaction", innerMap);
                }else{
                    errorTField5.setText(mustInt);
                }
                break;
                
            case "humann2":
                innerMapObject.put("todo", 1);
                innerMapObject.put("pathways", label5.getText());
                innerMapObject.put("nucleotide_database", label1.getText());
                innerMapObject.put("protein_database", label2.getText());
                listeModules.put("humann2", innerMapObject);
                break;
                
            case "classify_sklearn":
                if (isValidFloat(le5.getText())){
                    errorTField5.setText("");
                    innerMapObject.put("todo", 1);
                    innerMapObject.put("confidence", Double.valueOf(le5.getText()));
                    listeModules.put("classify_sklearn", innerMapObject);
                }else{
                    errorTField5.setText(mustDouble);
                }
                break;
                
            case "variant_callvar":
                if (isValidFloat(le3.getText())){
                    if (isInt(le1.getText())){
                        if (isInt(le2.getText())){
                            if (isInt(le4.getText())){
                                errorTField4.setText("");
                                errorTField2.setText("");
                                errorTField1.setText("");
                                errorTField3.setText("");
                                innerMapObject.put("todo", 1);
                                innerMapObject.put("min_freq", Double.valueOf(le3.getText()));
                                innerMapObject.put("min_mapping_quality", Integer.parseInt(le1.getText()));
                                innerMapObject.put("min_base_quality", Integer.parseInt(le2.getText()));
                                innerMapObject.put("min_depth", Integer.parseInt(le4.getText()));
                                listeModules.put("variant_callvar", innerMapObject);
                            }else{
                                errorTField4.setText(mustInt);
                            }
                        }else{
                            errorTField2.setText(mustInt);
                        }
                    }else{
                        errorTField1.setText(mustInt);
                    }
                }else{
                    errorTField3.setText(mustDouble);
                }
                break;
                
            case "bbwrap":
                innerMapObject.put("todo", 1);
                innerMapObject.put("path", label5.getText());
                listeModules.put("bbwrap", innerMapObject);
                break;
                
            case "diversity_alpha":
                innerMapObject.put("todo", 1);
                innerMapObject.put("metric", listeModulesDico.get("diversity_alpha"));
                listeModules.put("diversity_alpha", innerMapObject);
                listChoix.clear();
                break;
                
            case "diversity_beta":
                innerMapObject.put("todo", 1);
                innerMapObject.put("metric", listeModulesDico.get("diversity_beta"));
                listeModules.put("diversity_beta", innerMapObject);
                listChoix.clear();
                break;
                
            case "beta_group_significance":
                innerMapObject.put("todo", 1);
                innerMapObject.put("method", le1.getText());
                innerMapObject.put("metadata_column", listeModulesDico.get("beta_group_significance"));
                listeModules.put("beta_group_significance", innerMapObject);
                listChoix.clear();
                break;
                
            case "emperor_plot":
                innerMapObject.put("todo", 1);
                innerMapObject.put("metadata_column", listeModulesDico.get("emperor_plot"));
                listeModules.put("emperor_plot", innerMapObject);
                listChoix.clear();
                break;
                
            case "filter_samples":
                innerMapObject.put("todo", 1);
                innerMapObject.put("where", listeModulesDico.get("filter_samples"));
                listeModules.put("filter_samples", innerMapObject);
                listChoix.clear();
                break;
                
            case "taxa_collapse":
                innerMapObject.put("todo", 1);
                innerMapObject.put("level", listeModulesDico.get("taxa_collapse"));
                listeModules.put("level", innerMapObject);
                listChoix.clear();
                break;
                
            case "filter_features":
                if (isInt(le1.getText())){
                    if (isInt(le2.getText())){
                        errorTField2.setText("");
                        errorTField1.setText("");
                        innerMap.put("todo", 1);
                        innerMap.put("min_frequency", Integer.parseInt(le1.getText()));
                        innerMap.put("min_samples", Integer.parseInt(le2.getText()));
                        listeModules.put("filter_features", innerMap);
                    }else{
                        errorTField2.setText(mustInt);
                    }
                }else{
                    errorTField1.setText(mustInt);
                }
                
                break;
                
            case "ancom":
                innerMapObject.put("todo", 1);
                innerMapObject.put("metadata_column", listeModulesDico.get("ancom"));
                listeModules.put("ancom", innerMapObject);
                listChoix.clear();
                break;
                
            case "classify_samples_ncv":
                if (isInt(le2.getText())){
                    if (isInt(le3.getText())){
                        errorTField3.setText("");
                        errorTField2.setText("");
                        innerMapObject.put("todo", 1);
                        innerMapObject.put("estimator", le1.getText());
                        innerMapObject.put("n_estimators", Integer.parseInt(le2.getText()));
                        innerMapObject.put("cv", Integer.parseInt(le3.getText()));
                        innerMapObject.put("palette", le4.getText());
                        innerMapObject.put("metadata_column", listeModulesDico.get("classify_samples_ncv"));
                        listeModules.put("classify_samples_ncv", innerMapObject);
                        listChoix.clear();
                    }else{
                        errorTField3.setText(mustInt);
                    }
                }else{
                    errorTField2.setText(mustInt);
                }
                    
                break;
                
            case "lefse":
                if (isInt(le1.getText())){
                    errorTField1.setText("");
                    innerMapObject.put("todo", 1);
                    innerMapObject.put("lda", Integer.parseInt(le1.getText()));
                    innerMapObject.put("metadata_column", listeModulesDico.get("lefse"));
                    listeModules.put("lefse", innerMapObject);
                    listChoix.clear();
                }else{
                    errorTField1.setText(mustInt);
                }
                break;
                
            case "maaslin2":
                if (isValidFloat(le1.getText())){
                    errorTField1.setText("");
                    innerMapObject.put("todo", 1);
                    innerMapObject.put("qvalue", Double.valueOf(le1.getText()));
                    innerMapObject.put("metadata_column", listeModulesDico.get("maaslin2"));
                    listeModules.put("maaslin2", innerMapObject);
                    listChoix.clear();
                }else{
                    errorTField1.setText(mustDouble);
                }
                break;
                
            case "metaphlan2":
                innerMapObject.put("todo", 1);
                innerMapObject.put("bowtie2db", label1.getText());
                innerMapObject.put("mpa_pkl", label2.getText());
                innerMapObject.put("metadata_column", listeModulesDico.get("metaphlan2"));
                listeModules.put("metaphlan2", innerMapObject);
                listChoix.clear();
                break;
                
            case "metaphlan2_merge":
                innerMapObject.put("todo", 1);
                innerMapObject.put("level", listeModulesDico.get("metaphlan2_merge"));
                listeModules.put("metaphlan2_merge", innerMapObject);
                listChoix.clear();
                break;   
                
            case "variant_merge":
                innerMapObject.put("todo", 1);
                if (listeModulesDico.containsKey("variant_merge")){
                    innerMapObject.put("level", listeModulesDico.get("variant_merge"));
                }else{
                    List <String> hop = new ArrayList<String>();
                    innerMapObject.put("level", hop);
                }
                listeModules.put("variant_merge", innerMapObject);
                listChoix.clear();
                break;
                
            case "variant_premap":
                if (isInt(le1.getText())){
                    errorTField1.setText("");
                    innerMapObject.put("todo", 1);
                    innerMapObject.put("min_depth", Integer.parseInt(le1.getText()));
                    innerMapObject.put("ref", listeModulesDico.get("variant_premap"));
                    listeModules.put("variant_premap", innerMapObject);
                    listChoix.clear();
                }else{
                    errorTField1.setText(mustInt);
                }
                break;
                
            case "variant_genrefs":
                if (isInt(le2.getText())){
                    if (isValidFloat(le1.getText())){
                        errorTField1.setText("");
                        errorTField2.setText("");
                        innerMapObject.put("todo", 1);
                        innerMapObject.put("min_cov", Double.valueOf(le1.getText()));
                        innerMapObject.put("min_depth", Integer.parseInt(le2.getText()));
                        innerMapObject.put("ref", listeModulesDico.get("variant_genrefs"));
                        listeModules.put("variant_genrefs", innerMapObject);
                        listChoix.clear();
                    }else{
                        errorTField1.setText(mustDouble);
                    }
                }else{
                    errorTField2.setText(mustInt);
                }
                    
                break;
                
            case "variant_gentable":
                if (isValidFloat(le2.getText())){
                    errorTField2.setText("");
                    innerMapObject.put("todo", 1);
                    innerMapObject.put("datatype", le1.getText());
                    innerMapObject.put("min_cov", Double.valueOf(le2.getText()));
                    innerMapObject.put("bed", listeModulesDico.get("variant_gentable"));
                    listeModules.put("variant_gentable", innerMapObject);
                    listChoix.clear();
                }else{
                    errorTField2.setText(mustDouble);
                }
                break;    
                
                
            default : 
                break;
        }
     
    }
    
    /* Recuperation des fichiers fastQ*/
    public void handleButtonAction(ActionEvent event) {
           
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("SELECTIONNER LES FICHIERS FASTQ");
        List<File> files = fileChooser.showOpenMultipleDialog(stage);
        List<String> listPath= new ArrayList<>();
        
        for (File file: files){
            String nouvPath = "/ANALYSE" + file.getPath().split(":")[1];
            listPath.add(nouvPath.replace('\\', '/')) ;
        }

        printLog(listPath);
        listeModules.put("version :",0.01);
        listeModules.put("fastq", listPath);


        if(nbrR1!=nbrR2){
            this.ctrl.setText("ERROR"); 
            this.ctrl.setStyle("-fx-font-weight: bold ;-fx-text-fill:red;-fx-background-color:#e81212;"); 
            start.setDisable(true);
        }
        
        if(nbrR1==nbrR2){
            this.ctrl.setText("OK");
            this.ctrl.setStyle("-fx-font-weight: bold ;-fx-text-fill:green; -fx-background-color:#38ee00;");
            start.setDisable(false);
        }

    }
    
    /**
     * Fonction qui permet d'afficher dans l'interface les fichiers sélectionnés
     */
    public void printLog( List<String> files) {
        nbrR1=0;
        nbrR2=0;
        nomfichiers.setText("");
        for (String file : files) {
            this.nomfichiers.setText(this.nomfichiers.getText()+ file+"\n");
            if (file.contains("L001_R2")){
                nbrR2 = nbrR2+1;
            }else if (file.contains("L001_R1")){
                nbrR1 = nbrR1+1;
            }
        }
    }
    
    /**
     * Fonction qui enregistre les couples de valeurs entrés par l'utilisateur
     */
    @FXML
    public void handleAddCouple(ActionEvent event){
        String val1 = coupleVal1.getText();
        String val2 = coupleVal2.getText();
        List <String> listeMaaslin2 = new ArrayList<String>();
        listeMaaslin2.add(val1);
        listeMaaslin2.add(val2);
        List<Object> maListe = ((List<Object>)((Map<String, Object>)listeModules.get("maaslin2")).get("metadata_column"));
        maListe.add(listeMaaslin2);
        
        listChoix.clear();
        if(((Map<String, Object>)listeModules.get("maaslin2")).containsKey("metadata_column")){
            for (List<String> s : ((List<List<String>>)((Map<String, Object>)listeModules.get("maaslin2")).get("metadata_column"))){
                String valString = s.get(0) + ", " + s.get(1);
                listChoix.add(new Choix(valString));
                
            }
        }
        
        
        listeChoixTab.getItems().clear();
        listeChoixTab.getItems().addAll(listChoix);
        
    }
    
    /**
    * Recuperation des METADATA patients
    */
    @FXML
    public void handleButtonAction3(ActionEvent event) {
        
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("SELECTIONNER LES FICHIERS metadata");
        File file = fileChooser.showOpenDialog(stage);
        String metaPath= file.getPath() ;
        String nouvPath = "/ANALYSE" + metaPath.split(":")[1];
        nouvPath = nouvPath.replace('\\', '/');
        this.fmeta.setText(nouvPath);        
    }
     
    
    /**
    * Recuperation des resultats
    */
    @FXML
    public void handleButtonAction4(ActionEvent event) {
        
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        DirectoryChooser DirectoryChooser = new DirectoryChooser();
        DirectoryChooser.setTitle("Select result");
        File file = DirectoryChooser.showDialog(stage);
       String metaPath= file.getPath()+ "/";
        
        String nouvPath = "/ANALYSE" + metaPath.split(":")[1];
        nouvPath = nouvPath.replace('\\', '/');
        this.fresu.setText(nouvPath);
                
    }             
        
    
    /** 
    * Recuperation des fichiers classifier
    */
    @FXML
    public void handleButtonActionpath(ActionEvent event) {
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        DirectoryChooser DirectoryChooser = new DirectoryChooser();
        DirectoryChooser.setTitle("Select files");
        File file = DirectoryChooser.showDialog(stage);
        String metaPath= file.getPath()+"/" ;
        String nouvPath = "/ANALYSE" + metaPath.split(":")[1];
        nouvPath = nouvPath.replace('\\', '/');
        this.classifpath.setText(nouvPath);
           
   
    }
  
    /**
    * otus
    */
    @FXML
    public void handleButtonAction2(ActionEvent event) {
      
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select otus");
        File file = fileChooser.showOpenDialog(stage);
        String metaPath= file.getPath() ;
        String nouvPath = "/ANALYSE" + metaPath.split(":")[1];
        nouvPath = nouvPath.replace('\\', '/');
        this.classif.setText(nouvPath);
                   
    }
    
    
    /**
     * taxonomy
     */
    @FXML
    public void handleButtonActiontaxon(ActionEvent event) {
               
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select files");
        File file = fileChooser.showOpenDialog(stage);
        String metaPath= file.getPath() ;
        String nouvPath = "/ANALYSE" + metaPath.split(":")[1];
        nouvPath = nouvPath.replace('\\', '/');
        this.classiftaxon.setText(nouvPath);
             
    }

    /**
     * Fonction utilisée pour ouvrir l'explorateur de fichiers
     * @param event 
     */
    @FXML
    public void handleBoutonDirectory(ActionEvent event) {
        DirectoryChooser directoryChooser = new DirectoryChooser(); 
        directoryChooser.setTitle("Select files");
        //Show open file dialog

        File file = directoryChooser.showDialog(null);
        Button val = (Button) event.getSource();
        String id = val.getId();
       
        if(file!=null){
            if(id.equals("button1")){
                String nouvPath = "/ANALYSE" + file.getPath().split(":")[1];
                label1.setText(nouvPath.replace('\\', '/'));
            }else if (id.equals("button2")){
                String nouvPath = "/ANALYSE" + file.getPath().split(":")[1];
                label2.setText(nouvPath.replace('\\', '/'));
            }else if(id.equals("button3")){
                String nouvPath = "/ANALYSE" + file.getPath().split(":")[1];
                label3.setText(nouvPath.replace('\\', '/'));
            }else if(id.equals("button4")){
                String nouvPath = "/ANALYSE" + file.getPath().split(":")[1];
                label4.setText(nouvPath.replace('\\', '/'));
            }else{
                String nouvPath = "/ANALYSE" + file.getPath().split(":")[1];
                label5.setText(nouvPath.replace('\\', '/'));
            }

        }
    }

    
    /*
    * fonction qui affiche les parametres si on coche variant_callvar
    */
    @FXML
    public void handleClickVariantCallvar(){
        clearAfterFunction();
        if (variant_callvar.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("VARIANT CALLVAR");
            set1(true);
            set2(true);
            set3(true);
            set4(true);
            para3.setText("min_freq");
            para1.setText("min_mapping_quality");
            para2.setText("min_base_quality");
            para4.setText("min_depth");
            valueModule="variant_callvar";
            if (listeModules.containsKey("variant_callvar")){
                le3.setText((String)(((Map<String, Object>) listeModules.get("variant_callvar")).get("min_freq")).toString());
                le1.setText((String)(((Map<String, Object>) listeModules.get("variant_callvar")).get("min_mapping_quality")).toString());
                le2.setText((String)(((Map<String, Object>) listeModules.get("variant_callvar")).get("min_base_quality")).toString());
                le4.setText((String)(((Map<String, Object>) listeModules.get("variant_callvar")).get("min_depth")).toString());
                ((Map<String, Object>)listeModules.get("variant_callvar")).put("todo", 1);
            }
        }else{
            paneDetails.setVisible(false);
            set1(false);
            set2(false);
            set3(false);
            set4(false);
            valueModule="";
            if (listeModules.containsKey("variant_callvar")){
                ((Map<String, Object>)listeModules.get("variant_callvar")).put("todo", 0);
            }
            le5.clear();
        }
    }
    
    /*
    * fonction qui affiche les parametres si on coche classify_sklearn
    */
     @FXML
    public void handleClickClassifySKLearn(){
        clearAfterFunction();
        if (classify_sklearn.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("CLASSIFY SKLEARN");
            set5(true);
            para5.setText("confidence");
            valueModule="classify_sklearn";
            if (listeModules.containsKey("classify_sklearn")){
                le5.setText((String)(((Map<String, Object>) listeModules.get("classify_sklearn")).get("confidence")).toString());
                ((Map<String, Object>)listeModules.get("classify_sklearn")).put("todo", 1);
            }
        }else{
            paneDetails.setVisible(false);
            set5(false);
            valueModule="";
            if (listeModules.containsKey("classify_sklearn")){
                ((Map<String, Object>)listeModules.get("classify_sklearn")).put("todo", 0);
            }
            le5.clear();
        }
    }
    
    /*
    * fonction qui affiche les parametres si on coche alpha_rarefaction
    */
     @FXML
    public void handleClickAlphaRarefaction(){
        clearAfterFunction();
        if (alpha_rarefaction.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("ALPHA RAREFACTION");
            set5(true);
            para5.setText("max_depth");
            valueModule="alpha_rarefaction";
            if (listeModules.containsKey("alpha_rarefaction")){
                le5.setText((String)(((Map<String, Object>)listeModules.get("alpha_rarefaction")).get("max_depth")).toString());
                ((Map<String, Object>)listeModules.get("alpha_rarefaction")).put("todo", 1);
            }
        }else{
            paneDetails.setVisible(false);
            set5(false);
            valueModule="";
            if (listeModules.containsKey("alpha_rarefaction")){
                ((Map<String, Object>)listeModules.get("alpha_rarefaction")).put("todo", 0);
            }
            le5.clear();
        }
    }
    
    /*
    * fonction qui ajoute le stats_depth si coché
    */
    @FXML 
    public void handleClickStatDepth (){
        clearAfterFunction();
        paneDetails.setVisible(false);
        if (stats_depth.isSelected()){
            ((Map<String, Object>)listeModules.get("stats_depth")).put("todo", 1);
        }else{
            if (listeModules.containsKey("stats_depth")){
                ((Map<String, Object>)listeModules.get("stats_depth")).put("todo", 0);
            }
        }
    }
    
    /*
    * fonction qui ajoute le metaphlan2 export si coché
    */
    @FXML 
    public void handleClickMetaphlan2Export (){
        clearAfterFunction();
        paneDetails.setVisible(false);
        if (metaphlan2_export.isSelected()){
            ((Map<String, Object>)listeModules.get("metaphlan2_export")).put("todo", 1);
        }else{
            if (listeModules.containsKey("metaphlan2_export")){
                ((Map<String, Object>)listeModules.get("metaphlan2_export")).put("todo", 0);
            }
        }
    }
    
    /*
    * fonction qui ajoute le export_trimmed si coché
    */
    @FXML 
    public void handleClickExportTable (){
        clearAfterFunction();
        paneDetails.setVisible(false);
        if (export_table.isSelected()){
            ((Map<String, Object>)listeModules.get("export_table")).put("todo", 1);
        }else{
            if (listeModules.containsKey("export_table")){
                ((Map<String, Object>)listeModules.get("export_table")).put("todo", 0);
            }
        }
    }
    
    /*
    * fonction qui ajoute le export_trimmed si coché
    */
    @FXML 
    public void handleClickExportTrimmed (){
        clearAfterFunction();
        paneDetails.setVisible(false);
        if (export_trimmed.isSelected()){
            ((Map<String, Object>)listeModules.get("export_trimmed")).put("todo", 1);
        }else{
            if (listeModules.containsKey("export_trimmed")){
                ((Map<String, Object>)listeModules.get("export_trimmed")).put("todo", 0);
            }
        }
    }
    
    /*
    * fonction qui ajoute le picrust2_import si coché
    */
    @FXML 
    public void handleClickPicrust2Import (){
        clearAfterFunction();
        paneDetails.setVisible(false);
        if (picrust2_import.isSelected()){
            ((Map<String, Object>)listeModules.get("picrust2_import")).put("todo", 1);
        }else{
            if (listeModules.containsKey("picrust2_import")){
                ((Map<String, Object>)listeModules.get("picrust2_import")).put("todo", 0);
            }
        }
    }
    
    /*
    * fonction qui ajoute le picrust2_pipeline si coché
    */
    @FXML 
    public void handleClickPicrust2Pipeline (){
        clearAfterFunction();
        paneDetails.setVisible(false);
        if (picrust2_pipeline.isSelected()){
            ((Map<String, Object>)listeModules.get("picrust2_pipeline")).put("todo", 1);
        }else{
            if (listeModules.containsKey("picrust2_pipeline")){
                ((Map<String, Object>)listeModules.get("picrust2_pipeline")).put("todo", 0);
            }
        }
    }
    
    /*
    * fonction qui ajoute le humann2_merge si coché
    */
    @FXML 
    public void handleClickHumann2Merge(){
        clearAfterFunction();
        paneDetails.setVisible(false);
        if (humann2_merge.isSelected()){
            ((Map<String, Object>)listeModules.get("humann2_merge")).put("todo", 1);
        }else{
            if (listeModules.containsKey("humann2_merge")){
                ((Map<String, Object>)listeModules.get("humann2_merge")).put("todo", 0);
            }
        }
    }
    
    /*
    * fonction qui ajoute le alpha_group si coché
    */
    @FXML 
    public void handleClickAlphaGroup (){
        clearAfterFunction();
        paneDetails.setVisible(false);
        if (alpha_group_significance.isSelected()){
            ((Map<String, Object>)listeModules.get("alpha_group_significance")).put("todo", 1);
        }else{
            if (listeModules.containsKey("alpha_group_significance")){
                ((Map<String, Object>)listeModules.get("alpha_group_significance")).put("todo", 0);
            }
        }
    }
    
    /*
    fonction clique sur humann2
    */
    @FXML 
    public void handleClickHumann2(){
        clearAfterFunction();
        if (humann2.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("HUMANN2");
            fich5(true);
            fich2(true);
            fich1(true);
            para1.setText("nucleotide_database");
            para5.setText("pathways");
            para2.setText("protein_database");
            valueModule="humann2";
            if (listeModules.containsKey("humann2")){
                label1.setText((String)(((Map<String, Object>)listeModules.get("humann2")).get("nucleotide_database")).toString());
                label2.setText((String)(((Map<String, Object>)listeModules.get("humann2")).get("protein_database")).toString());
                label5.setText((String)(((Map<String, Object>)listeModules.get("humann2")).get("pathways")).toString());
                ((Map<String, Object>)listeModules.get("humann2")).put("todo", 1);
            }
        }else{
            paneDetails.setVisible(false);
            fich5(false);
            fich2(false);
            fich1(false);
            valueModule="";
            if (listeModules.containsKey("humann2")){
                ((Map<String, Object>)listeModules.get("humann2")).put("todo", 0);
            }
            clearAll();
        }
    }
    
    /*
    fonction clique sur filter features
    */
    @FXML 
    public void handleFilterFeatures(){
        clearAfterFunction();
        if (filter_features.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("FILTER FEATURES");
            set2(true);
            set1(true);
            para1.setText("min_frequency");
            para2.setText("min_samples");
            valueModule="filter_features";
            if (listeModules.containsKey("filter_features")){
                le1.setText((String)(((Map<String, Object>)listeModules.get("filter_features")).get("min_frequency")).toString());
                le2.setText((String)(((Map<String, Object>)listeModules.get("filter_features")).get("min_samples")).toString());
                ((Map<String, Object>)listeModules.get("filter_features")).put("todo", 1);
            }
        }else{
            paneDetails.setVisible(false);
            set2(false);
            set1(false);
            valueModule="";
            if (listeModules.containsKey("filter_features")){
                ((Map<String, Object>)listeModules.get("filter_features")).put("todo", 0);
            }
            clearAll();
            
        }
    }
    
    /*
    fonction clique sur bbwrap
    */
    @FXML 
    public void handleClickBBWrap(){
        clearAfterFunction();
        
        if (bwrap.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("BBWRAP");
            fich5(true);
            para5.setText("path");
            valueModule="bbwrap";
            if (listeModules.containsKey("bbwrap")){
                label5.setText((String)(((Map<String, Object>)(listeModules.get("bbwrap"))).get("path")));
                ((Map<String, Object>)listeModules.get("bbwrap")).put("todo", 1);
            }
        }else{
            paneDetails.setVisible(false);
            fich5(false);
            valueModule="";
            if (listeModules.containsKey("bbwrap")){
                ((Map<String, Object>)listeModules.get("bbwrap")).put("todo", 0);
            }
            clearAll();
        }
    }
        /*
    fonction clique sur diversity alpha
    */
    @FXML 
    public void handleClickDiversityAlpha(){
        clearAfterFunction();
        
        if (diversity_alpha.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("DIVERSITY ALPHA");
            para5.setText("metric");
            valueModule="diversity_alpha";
            if (listeModules.containsKey("diversity_alpha")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                ((Map<String, Object>)listeModules.get("diversity_alpha")).put("todo", 1);
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("diversity_alpha")).containsKey("metric")){
                    for (String s : ((ArrayList<String>)((Map<String, Object>)listeModules.get("diversity_alpha")).get("metric"))){
                        listChoix.add(new Choix(s));
                    }
                }
            }
            setDico(true);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("diversity_alpha")){
                ((Map<String, Object>)listeModules.get("diversity_alpha")).put("todo", 0);
            }
            clearAll();
            
        }
    }
    
    /*
    fonction clique sur diversity beta
    */
    @FXML 
    public void handleClickDiversityBeta(){
        clearAfterFunction();
        
        if (diversity_beta.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("DIVERSITY BETA");
            para5.setText("metric");
            valueModule="diversity_beta";
            if (listeModules.containsKey("diversity_beta")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                ((Map<String, Object>)listeModules.get("diversity_beta")).put("todo", 1);
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("diversity_beta")).containsKey("metric")){
                    for (String s : ((ArrayList<String>)((Map<String, Object>)listeModules.get("diversity_beta")).get("metric"))){
                        listChoix.add(new Choix(s));
                    }
                }
            }
            setDico(true);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("diversity_beta")){
                ((Map<String, Object>)listeModules.get("diversity_beta")).put("todo", 0);
            }
            clearAll();
            
        }
    }
    
    /*
    fonction clique sur beta group significance
    */
    @FXML 
    public void handleClickBetaGroupSigni(){
        clearAfterFunction();
        
        if (beta_group_significance.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("BETA GROUP SIGNIFICANCE");
            
            para5.setText("metadata_column");
            set1(true);
            para1.setText("method");
            valueModule="beta_group_significance";
            if (listeModules.containsKey("beta_group_significance")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                ((Map<String, Object>)listeModules.get("beta_group_significance")).put("todo", 1);
                le1.setText((String) (((Map<String, Object>)listeModules.get("beta_group_significance")).get("method")).toString());
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("beta_group_significance")).containsKey("metadata_column")){
                    for (String s : ((ArrayList<String>)((Map<String, Object>)listeModules.get("beta_group_significance")).get("metadata_column"))){
                        listChoix.add(new Choix(s));
                    }
                }
            }
            setDico(true);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("beta_group_significance")){
                ((Map<String, Object>)listeModules.get("beta_group_significance")).put("todo", 0);
            }
            clearAll();
            
        }
    }
    
    /*
    fonction clique sur emperor plot
    */
    @FXML 
    public void handleEmprorPlot(){
        clearAfterFunction();
        
        if (emperor_plot.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("EMPEROR PLOT");
            
            para5.setText("metadata_column");
            valueModule="emperor_plot";
            if (listeModules.containsKey("emperor_plot")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                ((Map<String, Object>)listeModules.get("emperor_plot")).put("todo", 1);
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("emperor_plot")).containsKey("metadata_column")){
                    for (String s : ((ArrayList<String>)((Map<String, Object>)listeModules.get("emperor_plot")).get("metadata_column"))){
                        listChoix.add(new Choix(s));
                    }
                }
            }
            setDico(true);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("emperor_plot")){
                ((Map<String, Object>)listeModules.get("emperor_plot")).put("todo", 0);
            }
            clearAll();
            
        }
    }
    
    /*
    fonction clique sur filter sample
    */
    @FXML 
    public void handleFilterSample(){
        clearAfterFunction();
        
        if (filter_samples.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("FILTER SAMPLE");
            
            para5.setText("where");
            valueModule="filter_samples";
            if (listeModules.containsKey("filter_samples")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                ((Map<String, Object>)listeModules.get("filter_samples")).put("todo", 1);
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("filter_samples")).containsKey("where")){
                    for (String s : ((ArrayList<String>)((Map<String, Object>)listeModules.get("filter_samples")).get("where"))){
                        listChoix.add(new Choix(s));
                    }
                }
            }
            setDico(true);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("filter_samples")){
                ((Map<String, Object>)listeModules.get("filter_samples")).put("todo", 0);
            }
            clearAll();
            
        }
    }
    
    /*
    fonction clique sur taxa collapse
    */
    @FXML 
    public void handleTaxaCollapse(){
        clearAfterFunction();
        
        if (taxa_collapse.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("TAXA COLLAPSE");
            
            para5.setText("level");
            valueModule="taxa_collapse";
            if (listeModules.containsKey("taxa_collapse")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                ((Map<String, Object>)listeModules.get("taxa_collapse")).put("todo", 1);
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("taxa_collapse")).containsKey("level")){
                    Map<String, Object> maMap = ((Map<String, Object>)listeModules.get("taxa_collapse"));
                    for (Integer s : ((List <Integer>)maMap.get("level"))){
                        listChoix.add(new Choix(s.toString()));
                    }
                }
            }
            setDico(true);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("taxa_collapse")){
                ((Map<String, Object>)listeModules.get("taxa_collapse")).put("todo", 0);
            }
            clearAll();
            
        }
    }
    
     /*
    fonction clique sur ancom
    */
    @FXML 
    public void handleAncom(){
        clearAfterFunction();
        
        if (ancom.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("ANCOM");
            
            valueModule="ancom";
            para5.setText("metadata_column");
            if (listeModules.containsKey("ancom")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                ((Map<String, Object>)listeModules.get("ancom")).put("todo", 1);
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("ancom")).containsKey("metadata_column")){
                    for (String s : ((ArrayList<String>)((Map<String, Object>)listeModules.get("ancom")).get("metadata_column"))){
                        listChoix.add(new Choix(s));
                    }
                }
            }
            setDico(true);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("ancom")){
                ((Map<String, Object>)listeModules.get("ancom")).put("todo", 0);
            }
            clearAll();
            
        }
    }
    
     /*
    fonction clique sur ncv
    */
    @FXML 
    public void handleNCV(){
        clearAfterFunction();
        
        if (classify_samples_ncv.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("CLASSIFY SAMPLES NCV");
            
            set1(true);
            set2(true);
            set3(true);
            set4(true);
            para1.setText("estimator");
            para2.setText("n_estimators");
            para3.setText("cv");
            para4.setText("palette");
            valueModule="classify_samples_ncv";
            para5.setText("metadata_column");
            if (listeModules.containsKey("classify_samples_ncv")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                le1.setText((String)(((Map<String, Object>)listeModules.get("classify_samples_ncv")).get("estimator")).toString());
                le2.setText((String)(((Map<String, Object>)listeModules.get("classify_samples_ncv")).get("n_estimators")).toString());
                le3.setText((String)(((Map<String, Object>)listeModules.get("classify_samples_ncv")).get("cv")).toString());
                le4.setText((String)(((Map<String, Object>)listeModules.get("classify_samples_ncv")).get("palette")).toString());                
                ((Map<String, Object>)listeModules.get("classify_samples_ncv")).put("todo", 1);
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("classify_samples_ncv")).containsKey("metadata_column")){
                    for (String s : ((ArrayList<String>)((Map<String, Object>)listeModules.get("classify_samples_ncv")).get("metadata_column"))){
                        listChoix.add(new Choix(s));
                    }
                    
                }
            }
            setDico(true);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("classify_samples_ncv")){
                ((Map<String, Object>)listeModules.get("classify_samples_ncv")).put("todo", 0);
            }
            clearAll();
            
        }
    }
    
    /*
    fonction clique sur lefse
    */
    @FXML 
    public void handleLefse(){
        clearAfterFunction();
        
        if (lefse.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("LEFSE");
            
            set1(true);
            para1.setText("lda");
            valueModule="lefse";
            para5.setText("metadata_column");
            if (listeModules.containsKey("lefse")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                le1.setText((String)(((Map<String, Object>)listeModules.get("lefse")).get("lda")).toString());     
                ((Map<String, Object>)listeModules.get("lefse")).put("todo", 1);
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("lefse")).containsKey("metadata_column")){
                    for (String s : ((ArrayList<String>)((Map<String, Object>)listeModules.get("lefse")).get("metadata_column"))){
                        listChoix.add(new Choix(s));
                    }
                }
            }
            setDico(true);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("lefse")){
                ((Map<String, Object>)listeModules.get("lefse")).put("todo", 0);
            }
            clearAll();
            
        }
    }
     /*
    fonction clique sur metaphlan2
    */
    @FXML 
    public void handleMetaphlan2(){
        clearAfterFunction();
        
        if (metaphlan2.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("METAPHLAN2");
            
            fich1(true);
            para1.setText("bowtie2bd");
            fich2(true);
            para2.setText("mpa_pkl");
            valueModule="metaphlan2";
            para5.setText("analysis_type");
            if (listeModules.containsKey("metaphlan2")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                label1.setText((String)(((Map<String, Object>)listeModules.get("metaphlan2")).get("bowtie2db")).toString());     
                label2.setText((String)(((Map<String, Object>)listeModules.get("metaphlan2")).get("mpa_pkl")).toString());
                ((Map<String, Object>)listeModules.get("metaphlan2")).put("todo", 1);
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("metaphlan2")).containsKey("analysis_type")){
                    for (String s : ((ArrayList<String>)((Map<String, Object>)listeModules.get("metaphlan2")).get("analysis_type"))){
                        listChoix.add(new Choix(s));
                    }
                }
            }
            setDico(true);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            fich1(false);
            fich2(false);
            valueModule="";
            if (listeModules.containsKey("metaphlan2")){
                ((Map<String, Object>)listeModules.get("metaphlan2")).put("todo", 0);
            }
            clearAll();
            
        }
    }
    
    /*
    fonction clique sur metaphlan2 merge
    */
    @FXML 
    public void handleMetaphlan2Merge(){
        clearAfterFunction();
        
        if (metaphlan2_merge.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("METAPHLAN2 MERGE");
            valueModule="metaphlan2_merge";
            para5.setText("level");
            if (listeModules.containsKey("metaphlan2_merge")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());   
                ((Map<String, Object>)listeModules.get("metaphlan2_merge")).put("todo", 1);
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("metaphlan2_merge")).containsKey("level")){
                    for (Integer s : ((ArrayList<Integer>)((Map<String, Object>)listeModules.get("metaphlan2_merge")).get("level"))){
                        listChoix.add(new Choix(s.toString()));
                    }
                }
            }
            setDico(true);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("metaphlan2_merge")){
                ((Map<String, Object>)listeModules.get("metaphlan2_merge")).put("todo", 0);
            }
            clearAll();
            
        }
    }
    
    /*
    fonction clique sur maaslin2
    */
    @FXML 
    public void handleMaaslin2(){
        clearAfterFunction();
        
        if (maaslin2.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("MAASLIN 2");
            
            set1(true);
            para1.setText("qvalue");
            valueModule="maaslin2";
            para5.setText("metadata_column");
            
            if (listeModules.containsKey("maaslin2")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                le1.setText((String)(((Map<String, Object>)listeModules.get("maaslin2")).get("qvalue")).toString());     
                ((Map<String, Object>)listeModules.get("maaslin2")).put("todo", 1);
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("maaslin2")).containsKey("metadata_column")){
                    for (List<String> s : ((List<List<String>>)((Map<String, Object>)listeModules.get("maaslin2")).get("metadata_column"))){
                        String valString = s.get(0) + ", " + s.get(1);
                        listChoix.add(new Choix(valString));
                    }
                }
            }
            setDico(true);
            le5.setVisible(false);
            boutonAdd.setVisible(false);
            coupleVal1.setVisible(true);
            coupleVal2.setVisible(true);
            addCouple.setVisible(true);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("maaslin2")){
                ((Map<String, Object>)listeModules.get("maaslin2")).put("todo", 0);
            }
            clearAll();
            
        }
        
    }
    
    /*
    fonction clique sur variant_merge
    */
  @FXML 
    public void handleVariantMerge(){
        clearAfterFunction();
        
        if (variant_merge.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("VARIANT MERGE");
            
            valueModule="variant_merge";
            para5.setText("level");
            if (listeModules.containsKey("variant_merge")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                ((Map<String, Object>)listeModules.get("variant_merge")).put("todo", 1);
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("variant_merge")).containsKey("level")){
                    for (Integer s : ((ArrayList<Integer>)((Map<String, Object>)listeModules.get("variant_merge")).get("level"))){
                        listChoix.add(new Choix(s.toString()));
                    }
                }
            }
            setDico(true);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("variant_merge")){
                ((Map<String, Object>)listeModules.get("variant_merge")).put("todo", 0);
            }
            clearAll();
            
        }
    }
    
    
    @FXML
    public void pressEnterDico(){
        List<String> maListe = new ArrayList <String>();
        maListe.add(le5.getText());
        //printdataDico(maListe);
        if (listeModulesDico.containsKey(valueModule)){
            
            if (valueModule.equals("taxa_collapse") || valueModule.equals("variant_merge") || valueModule.equals("metaphlan2_merge")){
                if(isInt(le5.getText())){
                    
                    errorTField5.setText("");
                    List<Integer> maListe2 = new ArrayList <Integer>();
                    maListe2 = (List<Integer>)listeModulesDico.get(valueModule);
                    maListe2.add(Integer.parseInt(le5.getText()));
                    
                    
                }else{
                    errorTField5.setText(mustInt);
                }
            }else{
                List<String> maListe2 = new ArrayList <String>();
                maListe2 = (List<String>)listeModulesDico.get(valueModule);
                maListe2.add(le5.getText());
                
            }
            
        }else{
            listeModulesDico.put(valueModule,maListe);
        }
        if (valueModule.equals("taxa_collapse") || valueModule.equals("variant_merge") || valueModule.equals("metaphlan2_merge")){
            if(isInt(le5.getText())){
                //((ArrayList<Integer>)((Map<String, Object>)listeModules.get(valueModule)).get("level")).add(Integer.parseInt(le5.getText()));
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get(valueModule)).containsKey("level")){
                    for (Integer s : ((ArrayList<Integer>)((Map<String, Object>)listeModules.get(valueModule)).get("level"))){
                        listChoix.add(new Choix(s.toString()));
                    }
                }
            }
        }else{
            //((ArrayList<String>)((Map<String, Object>)listeModules.get(valueModule)).get(para5.getText())).add((le5.getText()));
            listChoix.clear();
            if(((Map<String, Object>)listeModules.get(valueModule)).containsKey(para5.getText())){
                for (String s : ((ArrayList<String>)((Map<String, Object>)listeModules.get(valueModule)).get(para5.getText()))){
                    listChoix.add(new Choix(s));
                }
            }
        }
        listeChoixTab.getItems().clear();
        listeChoixTab.getItems().addAll(listChoix);     
    }
    
    /* clique variant premap*/
    @FXML 
    public void handleVariantPremap(){
        clearAfterFunction();
        if (variant_prema.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("VARIANT PREMAP");
            
            boutonFichierTab.setVisible(true);
            
            set1(true);
            para1.setText("min_depth");
            
            valueModule="variant_premap";
            para5.setText("ref");
            if (listeModules.containsKey("variant_premap")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                ((Map<String, Object>)listeModules.get("variant_premap")).put("todo", 1);
                le1.setText((String) (((Map<String, Object>)listeModules.get("variant_premap")).get("min_depth")).toString());
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("variant_premap")).containsKey("ref")){
                    for (String s : ((ArrayList<String>)((Map<String, Object>)listeModules.get("variant_premap")).get("ref"))){
                        listChoix.add(new Choix(s));
                    }
                }
                
            } 
            setDico(true);
            le5.setVisible(false);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("variant_premap")){
                ((Map<String, Object>)listeModules.get("variant_premap")).put("todo", 0);
            }
            clearAll();
            
        }
        boutonAdd.setVisible(false);
    }
    
    /* clique variant genref*/
    @FXML 
    public void handleVariantGenref(){
        clearAfterFunction();
        
          if (variant_genref.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("VARIANT GENREFS");
            
            boutonFichierTab.setVisible(true);
            
            set1(true);
            set2(true);
            para1.setText("min_cov");
            para2.setText("min_depth");
            
            valueModule="variant_genrefs";
            para5.setText("ref");
            if (listeModules.containsKey("variant_genrefs")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                ((Map<String, Object>)listeModules.get("variant_genrefs")).put("todo", 1);
                le1.setText((String) (((Map<String, Object>)listeModules.get("variant_genrefs")).get("min_cov")).toString());
                le2.setText((String) (((Map<String, Object>)listeModules.get("variant_genrefs")).get("min_depth")).toString());
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("variant_genrefs")).containsKey("ref")){
                    for (String s : ((ArrayList<String>)((Map<String, Object>)listeModules.get("variant_genrefs")).get("ref"))){
                        listChoix.add(new Choix(s));
                    }
                }
            }
          setDico(true);
            le5.setVisible(false);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("variant_genrefs")){
                ((Map<String, Object>)listeModules.get("variant_genrefs")).put("todo", 0);
            }
            clearAll();
            
        }
        boutonAdd.setVisible(false);
    }
    
    /* clique variant gentable*/
    @FXML 
    public void handleVariantGentable(){
        clearAfterFunction();
        
        if (variant_gentable.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("VARIANT GENTABLE");
            
            boutonFichierTab.setVisible(true);
            
            set1(true);
            set2(true);
            para1.setText("datatype");
            para2.setText("min_cov");
            
            valueModule="variant_gentable";
            para5.setText("bed");
            if (listeModules.containsKey("variant_gentable")){
                //labelDico.setText(listeModulesDico.get("diversity_alpha").toString());
                ((Map<String, Object>)listeModules.get("variant_gentable")).put("todo", 1);
                le1.setText((String) (((Map<String, Object>)listeModules.get("variant_gentable")).get("datatype")).toString());
                le2.setText((String) (((Map<String, Object>)listeModules.get("variant_gentable")).get("min_cov")).toString());
                listChoix.clear();
                if(((Map<String, Object>)listeModules.get("variant_gentable")).containsKey("bed")){
                    for (String s : ((ArrayList<String>)((Map<String, Object>)listeModules.get("variant_gentable")).get("bed"))){
                        listChoix.add(new Choix(s));
                    }
                }
                
            }
            setDico(true);
            le5.setVisible(false);
        }else{
            paneDetails.setVisible(false);
            setDico(false);
            valueModule="";
            if (listeModules.containsKey("variant_gentable")){
                ((Map<String, Object>)listeModules.get("variant_gentable")).put("todo", 0);
            }
            clearAll();
            
        }
        boutonAdd.setVisible(false);
    }
    
    /* Recuperation des fichiers dans le tableau*/
    public void handleButtonFichierTab(ActionEvent event) {
    
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("SELECTIONNER LES FICHIERS ");
        List<File> files = fileChooser.showOpenMultipleDialog(stage);
        pressEnterDicoTab(files);
    }
    
    /**
     * ajoute les fichiers sortis de l'explorateur de document au dictionnaire ListeModulesDico
     */
    @FXML
    public void pressEnterDicoTab(List<File> files){
        List<String> maListe = new ArrayList <String>();
        for(File file: files){
            String nouvPath = "/ANALYSE" + file.getPath().split(":")[1];
            maListe.add(nouvPath.replace('\\', '/'));
        }
        //printdataDico(maListe);
        if (listeModulesDico.containsKey(valueModule)){
            List<String> maListe2 = new ArrayList <String>();
            maListe2 = (List<String>) listeModulesDico.get(valueModule);
            
            for(File file: files){
                String nouvPath = "/ANALYSE" + file.getPath().split(":")[1];
                maListe2.add(nouvPath.replace('\\', '/'));
            }
        }else{
            listeModulesDico.put(valueModule,maListe);
        }
        for(File file: files){
            String nouvPath = "/ANALYSE" + file.getPath().split(":")[1];
            listChoix.add(new Choix(nouvPath.replace('\\', '/')));
        }
        listeChoixTab.getItems().clear();
        listeChoixTab.getItems().addAll(listChoix);        
    }
    
    /* Fonction pour repeter des choix du dictionnaire*/
    public void addButtonSuppDico(){
        TableColumn<Choix, Void> colBtn = new TableColumn("Supprimer");
        colBtn.setStyle( "-fx-alignment: CENTER;");
        colBtn.setMinWidth(100);
        Callback<TableColumn<Choix, Void>, TableCell<Choix, Void>> cellFactory = new Callback<TableColumn<Choix, Void>, TableCell<Choix, Void>>() {
            @Override
            public TableCell<Choix, Void> call(final TableColumn<Choix, Void> param) {
                final TableCell<Choix, Void> cell = new TableCell<Choix, Void>() {

                    private final Button btn = new Button("Supprimer");
                    {
                        btn.setOnAction((ActionEvent event) -> {
                            
                            Choix upl = getTableView().getItems().get(getIndex());
                           
                            listeChoixTab.getItems().clear();
                            List<String> maListe2 = new ArrayList <String>();
                            if(valueModule.equals("maaslin2")){
                                List<List<String>> maListe = ((List<List<String>>)((Map<String, Object>)listeModules.get("maaslin2")).get("metadata_column"));
                                for(List<String> cpl : maListe){
                                    int virgule = upl.getNomChoix().indexOf(",");
                                    if ((cpl.get(0).equals((upl.getNomChoix().substring(0, virgule)))) && (cpl.get(1).equals((upl.getNomChoix().substring(virgule+2))))){
                                        maListe.remove(cpl);
                                        break;
                                    }
                                }
                            }else{
                                maListe2 = (List<String>) listeModulesDico.get(valueModule);
                                maListe2.remove(upl.getNomChoix());
                            }
                            
                            
                            
                            listChoix.remove(upl);
                            listeChoixTab.getItems().addAll(listChoix);
                            
                        });
                    }

                    private Button getButton(){
                        return btn;
                    }
                    @Override
                    public void updateItem(Void item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                        } else {
                            setGraphic(btn);
                        }
                    }
                };
                
                return cell;
            }
        };
        colBtn.setCellFactory(cellFactory);
        listeChoixTab.getColumns().add(colBtn);
        
    }
      
    /*
    fonction clique sur phylogenic IQ tree
    */
    @FXML 
    public void handleClickIQTree(){
        clearAfterFunction();
        if (phylogeny_iqtre.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("PHYLOGENY IQTREE");
            set5(true);
            set4(true);
            set3(true);
            set2(true);
            set1(true);
            para1.setText("mode");
            para3.setText("perturb_nni_strength");
            para5.setText("stop_iter");
            para2.setText("bootstrap_replicates");
            para4.setText("n_cores");
            valueModule="phylogeny_iqtree";
            if (listeModules.containsKey("phylogeny_iqtree")){
                le1.setText((String) (((Map<String, Object>)listeModules.get("phylogeny_iqtree")).get("mode")).toString());
                le2.setText((String)(((Map<String, Object>)listeModules.get("phylogeny_iqtree")).get("bootstrap_replicates")).toString());
                le3.setText((String) (((Map<String, Object>)listeModules.get("phylogeny_iqtree")).get("perturb_nni_strength")).toString());
                le4.setText((String) (((Map<String, Object>)listeModules.get("phylogeny_iqtree")).get("n_cores")).toString());
                le5.setText((String) (((Map<String, Object>)listeModules.get("phylogeny_iqtree")).get("stop_iter")).toString());
                ((Map<String, Object>)listeModules.get("phylogeny_iqtree")).put("todo", 1);
                
            }
        }else{
            paneDetails.setVisible(false);
            set5(false);
            set4(false);
            set3(false);
            set2(false);
            set1(false);
            valueModule="";
            if (listeModules.containsKey("phylogeny_iqtree")){
                ((Map<String, Object>)listeModules.get("phylogeny_iqtree")).put("todo", 0);
            }
            clearAll();
            
        }
    }
    
    /**
     * gère le click sur checkbox rarefy
     */
    @FXML
    public void handleClickRarefy(){
        clearAfterFunction();
        if (rarefy.isSelected()){
            paneDetails.setVisible(true);
            nomModule.setText("RAREFY");
            set5(true);
            para5.setText("min_sampling_depth");
            valueModule="rarefy";
            if (listeModules.containsKey("rarefy")){
                le5.setText((String) (((Map<String, Object>)listeModules.get("rarefy")).get("min_sampling_depth")).toString());
                ((Map<String, Object>)listeModules.get("rarefy")).put("todo", 1);
            }
        }else{
            
            paneDetails.setVisible(false);
            set5(false);
            valueModule="";
            if (listeModules.containsKey("rarefy")){
                ((Map<String, Object>)listeModules.get("rarefy")).put("todo", 0);
            }
            le5.clear();
        }
    }
    
    
    /**
    * Fonction qui coche les checkbox de module en fonction du radio sélectionné.
    * Affiche ou n'affiche pas certains éléments
    * Associe chaque module à l'analyse microbiome ou résistome.
    */
    @FXML 
    public void handleAppVariant(ActionEvent event) {
        if (resistome.isSelected()){ //cas resistome
            //gere les apparitions
            frontreverse.setVisible(true);
            frontreversetxt.setVisible(true);
            frontforward.setVisible(true);
            frontforwardtxt.setVisible(true);
            variant_prema.setVisible(true);
            lvariant_prema.setVisible(true);
            lvariant_callvar.setVisible(true);
            lvariant_merge.setVisible(true);
            lvariant_gentable.setVisible(true);
            lvariant_genref.setVisible(true);
            variant_callvar.setVisible(true);
            variant_merge.setVisible(true);
            variant_gentable.setVisible(true);
            variant_genref.setVisible(true);
            
            //coche les checkbox
            bwrap.setSelected(true);
            rarefy.setSelected(false);
            phylogeny_iqtre.setSelected(false);
            diversity_alpha.setSelected(false);
            alpha_group_significance.setSelected(false);
            diversity_beta.setSelected(false);
            beta_group_significance.setSelected(false);
            emperor_plot.setSelected(false);
            alpha_rarefaction.setSelected(false);
            classify_sklearn.setSelected(false);
            filter_samples.setSelected(false);
            taxa_collapse.setSelected(false);
            filter_features.setSelected(true);
            ancom.setSelected(true);
            classify_samples_ncv.setSelected(false);
            picrust2_pipeline.setSelected(false);
            export_trimmed.setSelected(true);
            export_table.setSelected(false);
            stats_depth.setSelected(false);
            metaphlan2.setSelected(false);
            metaphlan2_merge.setSelected(false);
            metaphlan2_export.setSelected(true);
            humann2.setSelected(false);
            humann2_merge.setSelected(false);
            lefse.setSelected(true);
            maaslin2.setSelected(true);
            variant_prema.setSelected(true);
            variant_genref.setSelected(true);
            variant_callvar.setSelected(true);
            variant_gentable.setSelected(true);
            variant_merge.setSelected(true);
            
            //change les valeurs de todo du dico
            ((Map<String, Object>)listeModules.get("bbwrap")).put("todo", 1);
            ((Map<String, Integer>)listeModules.get("rarefy")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("phylogeny_iqtree")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("diversity_alpha")).put("todo", 0);
            ((Map<String, Integer>)listeModules.get("alpha_group_significance")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("diversity_beta")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("beta_group_significance")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("emperor_plot")).put("todo", 0);
            ((Map<String, Integer>)listeModules.get("alpha_rarefaction")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("classify_sklearn")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("filter_samples")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("taxa_collapse")).put("todo", 0);
            ((Map<String, Integer>)listeModules.get("filter_features")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("ancom")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("classify_samples_ncv")).put("todo", 0);
            ((Map<String, Integer>)listeModules.get("picrust2_pipeline")).put("todo", 0);
            ((Map<String, Integer>)listeModules.get("picrust2_import")).put("todo", 0);
            ((Map<String, Integer>)listeModules.get("export_trimmed")).put("todo", 1);
            ((Map<String, Integer>)listeModules.get("export_table")).put("todo", 0);
            ((Map<String, Integer>)listeModules.get("stats_depth")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("metaphlan2")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("metaphlan2_merge")).put("todo", 0);
            ((Map<String, Integer>)listeModules.get("metaphlan2_export")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("humann2")).put("todo", 0);
            ((Map<String, Integer>)listeModules.get("humann2_merge")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("lefse")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("maaslin2")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("variant_premap")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("variant_genrefs")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("variant_callvar")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("variant_gentable")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("variant_merge")).put("todo", 1);

            
        }else{ // cas microbiome
            //gere les apparitions
            frontreverse.setVisible(false);
            frontreversetxt.setVisible(false);
            frontforward.setVisible(false);
            frontforwardtxt.setVisible(false);
            variant_prema.setVisible(false);
            variant_callvar.setVisible(false);
            variant_merge.setVisible(false);
            variant_gentable.setVisible(false);
            variant_genref.setVisible(false);
            lvariant_prema.setVisible(false);
            lvariant_callvar.setVisible(false);
            lvariant_merge.setVisible(false);
            lvariant_gentable.setVisible(false);
            lvariant_genref.setVisible(false);
            
            //coche les checkbox
            bwrap.setSelected(true);
            rarefy.setSelected(false);
            phylogeny_iqtre.setSelected(true);
            diversity_alpha.setSelected(true);
            alpha_group_significance.setSelected(true);
            diversity_beta.setSelected(true);
            beta_group_significance.setSelected(true);
            emperor_plot.setSelected(true);
            alpha_rarefaction.setSelected(true);
            classify_sklearn.setSelected(true);
            filter_samples.setSelected(true);
            taxa_collapse.setSelected(true);
            filter_features.setSelected(true);
            ancom.setSelected(true);
            classify_samples_ncv.setSelected(true);
            picrust2_pipeline.setSelected(true);
            export_trimmed.setSelected(true);
            export_table.setSelected(true);
            stats_depth.setSelected(false);
            metaphlan2.setSelected(false);
            metaphlan2_merge.setSelected(false);
            metaphlan2_export.setSelected(false);
            humann2.setSelected(false);
            humann2_merge.setSelected(false);
            lefse.setSelected(true);
            maaslin2.setSelected(true);
            variant_prema.setSelected(false);
            variant_genref.setSelected(false);
            variant_callvar.setSelected(false);
            variant_gentable.setSelected(false);
            variant_merge.setSelected(false);

            //change les valeurs de todo du dico
            ((Map<String, Object>)listeModules.get("bbwrap")).put("todo", 1);
            ((Map<String, Integer>)listeModules.get("rarefy")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("phylogeny_iqtree")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("diversity_alpha")).put("todo", 1);
            ((Map<String, Integer>)listeModules.get("alpha_group_significance")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("diversity_beta")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("beta_group_significance")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("emperor_plot")).put("todo", 1);
            ((Map<String, Integer>)listeModules.get("alpha_rarefaction")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("classify_sklearn")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("filter_samples")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("taxa_collapse")).put("todo", 1);
            ((Map<String, Integer>)listeModules.get("filter_features")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("ancom")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("classify_samples_ncv")).put("todo", 1);
            ((Map<String, Integer>)listeModules.get("picrust2_pipeline")).put("todo", 1);
            ((Map<String, Integer>)listeModules.get("picrust2_import")).put("todo", 1);
            ((Map<String, Integer>)listeModules.get("export_trimmed")).put("todo", 0);
            ((Map<String, Integer>)listeModules.get("export_table")).put("todo", 1);
            ((Map<String, Integer>)listeModules.get("stats_depth")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("metaphlan2")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("metaphlan2_merge")).put("todo", 0);
            ((Map<String, Integer>)listeModules.get("metaphlan2_export")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("humann2")).put("todo", 0);
            ((Map<String, Integer>)listeModules.get("humann2_merge")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("lefse")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("maaslin2")).put("todo", 1);
            ((Map<String, Object>)listeModules.get("variant_premap")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("variant_genrefs")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("variant_callvar")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("variant_gentable")).put("todo", 0);
            ((Map<String, Object>)listeModules.get("variant_merge")).put("todo", 0);
        }
       
    }
    
    /**
     * Met les valeurs par défaut dans le dictionnaoire des modules listeModules et dans listeModulesDico, cas d'un resistome
     */
    public void initialiseDico (){
        HashMap<String, Integer>innerMap = new HashMap<>();
        HashMap<String, String>innerMapString = new HashMap<>();
        HashMap<String, Double>innerMapDouble = new HashMap<>();
        HashMap<String, Object>innerMapObject = new HashMap<>();
        
        HashMap <String, Integer> listeRarefy = new HashMap<>();
        listeRarefy.put("todo", 0);
        listeRarefy.put("min_sampling_depth", 7500);
        listeModules.put("rarefy", listeRarefy);
        
        HashMap <String, Object> listePhylogenyIQTREE = new HashMap<>();
        listePhylogenyIQTREE.put("todo", 0);
        listePhylogenyIQTREE.put("mode", "fasttree");
        listePhylogenyIQTREE.put("perturb_nni_strength", 0.2);
        listePhylogenyIQTREE.put("stop_iter", 200);
        listePhylogenyIQTREE.put("bootstrap_replicates", 1000);
        listePhylogenyIQTREE.put("n_cores", 0);
        listeModules.put("phylogeny_iqtree", listePhylogenyIQTREE);
        
        HashMap <String, Object> listeDivAlpha = new HashMap<>();
        listeDivAlpha.put("todo", 0);
        List <String> listeMetric = new ArrayList<String>();
        listeMetric.add("faith_pd");
        listeMetric.add("chao1");
        listeMetric.add("shannon");
        listeMetric.add("simpson");
        listeMetric.add("observed_otus");
        listeMetric.add("pielou_e");
        listeDivAlpha.put("metric", listeMetric);
        listeModulesDico.put("diversity_alpha", listeMetric);
        listeModules.put("diversity_alpha", listeDivAlpha);
        
        HashMap <String, Object> listAlphaGroupSigni = new HashMap<>();
        listAlphaGroupSigni.put("todo", 0);
        listeModules.put("alpha_group_significance", listAlphaGroupSigni);
        
        HashMap <String, Object> listBBWrap = new HashMap<>();
        listBBWrap.put("todo", 1);
        listBBWrap.put("path", "/ANALYSE/microbio/db/bbmap/");
        listeModules.put("bbwrap", listBBWrap);
        bwrap.setSelected(true);
        
        HashMap <String, Object> listDivBeta = new HashMap<>();
        listDivBeta.put("todo", 0);
        List <String> listeMetricBeta = new ArrayList<String>();
        listeMetricBeta.add("braycurtis");
        listeMetricBeta.add("jaccard");
        listeMetricBeta.add("unweighted_unifrac");
        listeMetricBeta.add("weighted_unifrac");
        listDivBeta.put("metric", listeMetricBeta);
        listeModulesDico.put("diversity_beta", listeMetricBeta);
        listeModules.put("diversity_beta", listDivBeta);
        
        HashMap <String, Object> listBetaGroup = new HashMap<>();
        listBetaGroup.put("todo", 0);
        List <String> listeMetadataBeta = new ArrayList<String>();
        listeMetadataBeta.add("MOBIDIAG");
        listeMetadataBeta.add("SEX");
        listeMetadataBeta.add("LESION");
        listeMetadataBeta.add("DELAI_SUP24H");
        listeMetadataBeta.add("PPI");
        listeMetadataBeta.add("AGECAT");
        listeMetadataBeta.add("LDN");
        listeMetadataBeta.add("ATCD_HP");
        listeMetadataBeta.add("HP_SR");
        listeMetadataBeta.add("LESION_ANTRUM");
        listeMetadataBeta.add("LESION_FUNDUS");
        listeMetadataBeta.add("CAGA");
        listBetaGroup.put("method", "permanova");
        listBetaGroup.put("metadata_column", listeMetadataBeta);
        listeModulesDico.put("beta_group_significance", listeMetadataBeta);
        listeModules.put("beta_group_significance", listBetaGroup);
        
        HashMap <String, Object> listEmperorPlot = new HashMap<>();
        listEmperorPlot.put("todo", 0);
        List <String> listeEmperorPlot = new ArrayList<String>();
        listeEmperorPlot.add("none");
        listEmperorPlot.put("metadata_column", listeEmperorPlot);
        listeModulesDico.put("emperor_plot", ((List<String>)listeEmperorPlot));
        listeModules.put("emperor_plot", listEmperorPlot);
        
        HashMap <String, Integer> listAlphaRare = new HashMap<>();
        listAlphaRare.put("todo", 0);
        listAlphaRare.put("max_depth", 10000);
        listeModules.put("alpha_rarefaction", listAlphaRare);
        
        HashMap <String, Object> listClassifySKL = new HashMap<>();
        listClassifySKL.put("todo", 0);
        listClassifySKL.put("confidence", 0.7);
        listeModules.put("classify_sklearn", listClassifySKL);
        
        HashMap <String, Object> listFilterSamples = new HashMap<>();
        listFilterSamples.put("todo", 0);
        List <String> listeWhereSample = new ArrayList<String>();
        listFilterSamples.put("where", listeWhereSample);
        listeModulesDico.put("filter_samples", listeWhereSample);
        listeModules.put("filter_samples", listFilterSamples);
        
        HashMap <String, Object> listTaxaCollapse = new HashMap<>();
        listTaxaCollapse.put("todo", 0);
        List <Integer> listeTaxa = new ArrayList<Integer>();
        listeTaxa.add(2);
        listeTaxa.add(6);
        listeTaxa.add(7);
        listTaxaCollapse.put("level", listeTaxa);
        listeModulesDico.put("taxa_collapse", listeTaxa);
        listeModules.put("taxa_collapse", listTaxaCollapse);
        
        HashMap <String, Integer> listFilterFeatures = new HashMap<>();
        listFilterFeatures.put("todo", 1);
        listFilterFeatures.put("min_frequency", 100);
        listFilterFeatures.put("min_samples", 10);
        listeModules.put("filter_features", listFilterFeatures);
        filter_features.setSelected(true);
        
        HashMap <String, Object> listAncom = new HashMap<>();
        listAncom.put("todo", 1);
        List <String> listeAncom = new ArrayList<String>();
        listeAncom.add("MOBIDIAG");
        listeAncom.add("LESION");
        listeAncom.add("SEX");
        listeAncom.add("DELAI_SUP24H");
        listeAncom.add("PPI");
        listeAncom.add("AGECAT");
        listeAncom.add("LDN");
        listeAncom.add("ATCD_HP");
        listeAncom.add("HP_SR");
        listeAncom.add("LESION_ANTRUM");
        listeAncom.add("LESION_FUNDUS");
        listeAncom.add("CAGA");
        listeModulesDico.put("ancom", listeAncom);
        listAncom.put("metadata_column", listeAncom);
        listeModules.put("ancom", listAncom);
        ancom.setSelected(true);
        
        HashMap <String, Object> listClassifySamples = new HashMap<>();
        listClassifySamples.put("todo", 0);
        List <String> listeClassifySamples = new ArrayList<String>();
        listeClassifySamples.add("MOBIDIAG");
        listeClassifySamples.add("LESION");
        listeClassifySamples.add("SEX");
        listeClassifySamples.add("DELAI_SUP24H");
        listeClassifySamples.add("PPI");
        listeClassifySamples.add("AGECAT");
        listeClassifySamples.add("LDN");
        listeClassifySamples.add("ATCD_HP");
        listeClassifySamples.add("HP_SR");
        listeClassifySamples.add("LESION_ANTRUM");
        listeClassifySamples.add("LESION_FUNDUS");
        listeClassifySamples.add("CAGA");
        listClassifySamples.put("metadata_column", listeClassifySamples);
        listClassifySamples.put("estimator", "RandomForestClassifier");
        listClassifySamples.put("n_estimators", 200);
        listClassifySamples.put("cv", 100);
        listClassifySamples.put("palette", "greyscale");
        listeModulesDico.put("classify_samples_ncv", listeClassifySamples);
        listeModules.put("classify_samples_ncv", listClassifySamples);
        
        HashMap <String, Integer> listPicrust2 = new HashMap<>();
        listPicrust2.put("todo", 0);
        listeModules.put("picrust2_pipeline", listPicrust2);
        
        HashMap <String, Integer> listPicrustImport = new HashMap<>();
        listPicrustImport.put("todo", 0);
        listeModules.put("picrust2_import", listPicrustImport);
        
        HashMap <String, Integer> listExporttrimmed = new HashMap<>();
        listExporttrimmed.put("todo", 1);
        listeModules.put("export_trimmed", listExporttrimmed);
        export_trimmed.setSelected(true);
        
        HashMap <String, Integer> listExportTable = new HashMap<>();
        listExportTable.put("todo", 1);
        listeModules.put("export_table", listExportTable);
        export_table.setSelected(true);
        
        HashMap <String, Integer> listStatDepth = new HashMap<>();
        listStatDepth.put("todo", 0);
        listeModules.put("stats_depth", listStatDepth);
        
        HashMap <String, Object> listmetaphlan2 = new HashMap<>();
        listmetaphlan2.put("todo", 0);
        listmetaphlan2.put("bowtie2db", "/ANALYSE/microbio/db/yamp/bowtie2db_20");
        listmetaphlan2.put("mpa_pkl", "/ANALYSE/microbio/db/yamp/bowtie2db_20/mpa_v20_m200.pkl");
        List <String> listeMetaphlan2 = new ArrayList<String>();
        listmetaphlan2.put("analysis_type", listeMetaphlan2);
        listeModulesDico.put("metaphlan2", listeMetaphlan2);
        listeModules.put("metaphlan2", listmetaphlan2);
        
        HashMap <String, Object> listmetaphlan2Merge = new HashMap<>();
        listmetaphlan2Merge.put("todo", 0);
        List <String> listeMetaphlan2Merge = new ArrayList<String>();
        listmetaphlan2Merge.put("level", listeMetaphlan2Merge);
        listeModulesDico.put("metaphlan2_merge", listeMetaphlan2Merge);
        listeModules.put("metaphlan2_merge", listmetaphlan2Merge);
        
        HashMap <String, Integer> listmetaphlan2Export = new HashMap<>();
        listmetaphlan2Export.put("todo", 1);
        listeModules.put("metaphlan2_export", listmetaphlan2Export);
        metaphlan2_export.setSelected(true);
        
        HashMap <String, Object> listHumann2 = new HashMap<>();
        listHumann2.put("todo", 0);
        listHumann2.put("nucleotide_database", "/ANALYSE/microbio/db/yamp/chocophlan_1_1/");
        listHumann2.put("protein_database", "/ANALYSE/microbio/db/yamp/uniref90_1_1/");
        listHumann2.put("pathways", "");
        listeModules.put("humann2", listHumann2);
        
        HashMap <String, Integer> listHumann2Merge = new HashMap<>();
        listHumann2Merge.put("todo", 0);
        listeModules.put("humann2_merge", listHumann2Merge);
        
        HashMap <String, Object> listLefse = new HashMap<>();
        listLefse.put("todo", 1);
        List <String> listeLefse = new ArrayList<String>();
        listeLefse.add("MOBIDIAG");
        listeLefse.add("LESION");
        listeLefse.add("SEX");
        listeLefse.add("DELAI_SUP24H");
        listeLefse.add("PPI");
        listeLefse.add("AGECAT");
        listeLefse.add("LDN");
        listeLefse.add("ATCD_HP");
        listeLefse.add("HP_SR");
        listeLefse.add("LESION_ANTRUM");
        listeLefse.add("LESION_FUNDUS");
        listeLefse.add("CAGA");
        listLefse.put("metadata_column", listeLefse);
        listLefse.put("lda", 2);
        listeModulesDico.put("lefse", listeLefse);
        listeModules.put("lefse", listLefse);
        lefse.setSelected(true);
        
        HashMap <String, Object> listMaaslin2 = new HashMap<>();
        listMaaslin2.put("todo", 1);
        List <Object> listeMaaslin = new ArrayList<Object>();
        List <String> listeMaaslin2 = new ArrayList<String>();
        listeMaaslin2.add("MOBIDIAG");
        listeMaaslin2.add("LESION");
        listeMaaslin.add(listeMaaslin2);
        listMaaslin2.put("metadata_column", listeMaaslin);
        listMaaslin2.put("qvalue", 0.25);
        listeModulesDico.put("maaslin2", listeMaaslin2);
        listeModules.put("maaslin2", listMaaslin2);
        maaslin2.setSelected(true);
        
        HashMap <String, Object> listVariantPremap = new HashMap<>();
        listVariantPremap.put("todo", 1);
        List <String> listeVariantPremap = new ArrayList<String>();
        listeVariantPremap.add("/ANALYSE/microbio/db/ref/HP26695.fna");
        listVariantPremap.put("ref", listeVariantPremap);
        listVariantPremap.put("min_depth", 200);
        listeModulesDico.put("variant_premap", listeVariantPremap);
        listeModules.put("variant_premap", listVariantPremap);
        variant_prema.setSelected(true);
        
        HashMap <String, Object> listVariantGenrefs = new HashMap<>();
        listVariantGenrefs.put("todo", 1);
        List <String> listeVariantGenrefs = new ArrayList<String>();
        listeVariantGenrefs.add("/ANALYSE/microbio/db/ref/HP26695.fna");
        listVariantGenrefs.put("ref", listeVariantGenrefs);
        listVariantGenrefs.put("min_cov", 0.05);
        listVariantGenrefs.put("min_depth", 200);
        listeModulesDico.put("variant_genrefs", listeVariantGenrefs);
        listeModules.put("variant_genrefs", listVariantGenrefs);
        variant_genref.setSelected(true);
        
        HashMap <String, Object> listVariantCallvar = new HashMap<>();
        listVariantCallvar.put("todo", 1);
        listVariantCallvar.put("min_mapping_quality", 20);
        listVariantCallvar.put("min_base_quality", 20);
        listVariantCallvar.put("min_freq", 0.01);
        listVariantCallvar.put("min_depth", 10);
        listeModules.put("variant_callvar", listVariantCallvar);
        variant_callvar.setSelected(true);
        
        HashMap <String, Object> listVariantGentable = new HashMap<>();
        listVariantGentable.put("todo", 1);
        listVariantGentable.put("datatype", "norm");
        List <String> listeVariantGentable = new ArrayList<String>();
        listeVariantGentable.add("/ANALYSE/microbio/db/ref/HP26695.bed");
        listVariantGentable.put("bed", listeVariantGentable);
        listVariantGentable.put("min_cov", 0.05);
        listeModulesDico.put("variant_gentable", listeVariantGentable);
        listeModules.put("variant_gentable", listVariantGentable);
        variant_gentable.setSelected(true);
        
        HashMap <String, Object> listVariantMerge = new HashMap<>();
        listVariantMerge.put("todo", 1);
        List <String> listeVariantMerge = new ArrayList<String>();
        listVariantMerge.put("level", listeVariantMerge);
        listeModulesDico.put("variant_merge", listeVariantMerge);
        listeModules.put("variant_merge", listVariantMerge);
        variant_merge.setSelected(true);
    }
    
    /**
     * vide l'interface et les textfield une fois les informations validées
     */
    public void clearAfterFunction(){
        clearAll();
        set5(false);
        set4(false);
        set3(false);
        set2(false);
        set1(false);
        fich1(false);
        fich2(false);
        fich3(false);
        fich4(false);
        fich5(false);
        appGen(false);
    }
    
    /**
     * change les parmètres d'affichage de la zone 5
     */
    public void set5(Boolean val){
        para5.setVisible(val);
        le5.setVisible(val);
        coupleVal1.setVisible(false);
        coupleVal2.setVisible(false);
        addCouple.setVisible(false);
        appGen(val);
    }
    
    /**
     * change les parmètres d'affichage de la zone 4
     */
    public void set4(Boolean val){
        para4.setVisible(val);
        le4.setVisible(val);
        appGen(val);
    }
    
    /**
     * change les parmètres d'affichage de la zone 3
     */
    public void set3(Boolean val){
        para3.setVisible(val);
        le3.setVisible(val);
        appGen(val);
    }
    
    /**
     * change les parmètres d'affichage de la zone 2
     */
    public void set2(Boolean val){
        para2.setVisible(val);
        le2.setVisible(val);
        appGen(val);
    }
    
    /**
     * change les parmètres d'affichage de la zone 1
     */
    public void set1(Boolean val){
        para1.setVisible(val);
        le1.setVisible(val);
        appGen(val);
    }
    
    /**
     * change les parmètres d'affichage de la zone 1 pour les fichiers
     */
    public void fich1(Boolean val){
        para1.setVisible(val);
        button1.setVisible(val);
        label1.setVisible(val);
        appGen(val);
    }
    
    /**
     * change les parmètres d'affichage de la zone 2 pour les fichiers
     */
    public void fich2(Boolean val){
        para2.setVisible(val);
        button2.setVisible(val);
        label2.setVisible(val);
        appGen(val);
    }
    
    /**
     * change les parmètres d'affichage de la zone 3 pour les fichiers
     */
    public void fich3(Boolean val){
        para3.setVisible(val);
        button3.setVisible(val);
        label3.setVisible(val);
        appGen(val);
    }
    
    /**
     * change les parmètres d'affichage de la zone 4 pour les fichiers
     */
    public void fich4(Boolean val){
        para4.setVisible(val);
        button4.setVisible(val);
        label4.setVisible(val);
        appGen(val);
    }
    
    /**
     * change les parmètres d'affichage de la zone 5 pour les fichiers
     */
    public void fich5(Boolean val){
        para5.setVisible(val);
        button5.setVisible(val);
        label5.setVisible(val);
        appGen(val);
    }
    
    /**
     * change les parmètres d'affichage du titre et du bouton valider
     */
    public void appGen(Boolean val){
    nomModule.setVisible(val);
    valid.setVisible(val);
    }
    
    /**
     * change les parmètres d'affichage de la zone 5 pour afficher le tableau de la zone 5
     */
    public void setDico(Boolean val){
      set5(val);
      
      listeChoix.setVisible(val);
      //listChoix.clear();
      listeChoixTab.getItems().addAll(listChoix);
      //listeChoixTab.getItems().clear();
      boutonAdd.setVisible(val);
      //labelDico.setText("");
    }
    
    /**
     * Remet tous les champs de saisi et tableaux à 0
     */
    public void clearAll(){
        le5.clear();
        le1.clear();
        le2.clear();
        le3.clear();
        le4.clear();
        label1.setText("");
        label2.setText("");
        label3.setText("");
        label4.setText("");
        label5.setText("");
        errorTField5.setText("");
        errorTField4.setText("");
        errorTField3.setText("");
        errorTField2.setText("");
        errorTField1.setText("");
        listeChoixTab.getItems().clear();
        listChoix.clear();
        listeChoixTab.getItems().addAll(listChoix);
        setDico(false);
        boutonFichierTab.setVisible(false);
       // listChoixCouple1.clear();
        //listChoixCouple2.clear();
       // setDicoCouple(false);
    }
    
    /**
     * fonction qui coche les cases des modules dans le cas du replay
     */
    public void initialiseModulesReplay(){
        int monInt = ((Double)((Map<String, Object>)listeModules.get("bbwrap")).get("todo")).intValue();
        if (monInt == 1){
            bwrap.setSelected(true);
            ((Map<String, Object>)listeModules.get("bbwrap")).put("todo", 1);
        }else{
            ((Map<String, Object>)listeModules.get("bbwrap")).put("todo", 0);
            bwrap.setSelected(false);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("rarefy")).get("todo")).intValue();
        int min_sample = ((Double)((Map<String, Object>)listeModules.get("rarefy")).get("min_sampling_depth")).intValue();
        ((Map<String, Object>)listeModules.get("rarefy")).put("min_sampling_depth", min_sample);
        if (monInt == 1){
            rarefy.setSelected(true);
            ((Map<String, Object>)listeModules.get("rarefy")).put("todo", 1);
        }else{
            rarefy.setSelected(false);
            ((Map<String, Object>)listeModules.get("rarefy")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("phylogeny_iqtree")).get("todo")).intValue();
        int stop_iter = ((Double)((Map<String, Object>)listeModules.get("phylogeny_iqtree")).get("stop_iter")).intValue();
        ((Map<String, Object>)listeModules.get("phylogeny_iqtree")).put("stop_iter", stop_iter);
        int bootstrap = ((Double)((Map<String, Object>)listeModules.get("phylogeny_iqtree")).get("bootstrap_replicates")).intValue();
        ((Map<String, Object>)listeModules.get("phylogeny_iqtree")).put("bootstrap_replicates", bootstrap);
        int cores = ((Double)((Map<String, Object>)listeModules.get("phylogeny_iqtree")).get("n_cores")).intValue();
        ((Map<String, Object>)listeModules.get("phylogeny_iqtree")).put("n_cores", cores);
        if (monInt == 1){
            phylogeny_iqtre.setSelected(true);
            ((Map<String, Object>)listeModules.get("phylogeny_iqtree")).put("todo", 1);
        }else{
            phylogeny_iqtre.setSelected(false);
            ((Map<String, Object>)listeModules.get("phylogeny_iqtree")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("diversity_alpha")).get("todo")).intValue();
        if (monInt == 1){
            diversity_alpha.setSelected(true);
            ((Map<String, Object>)listeModules.get("diversity_alpha")).put("todo", 1);
        }else{
            diversity_alpha.setSelected(false);
            ((Map<String, Object>)listeModules.get("diversity_alpha")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("alpha_group_significance")).get("todo")).intValue();
        if (monInt == 1){
            alpha_group_significance.setSelected(true);
            ((Map<String, Object>)listeModules.get("alpha_group_significance")).put("todo", 1);
        }else{
            alpha_group_significance.setSelected(false);
            ((Map<String, Object>)listeModules.get("alpha_group_significance")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("diversity_beta")).get("todo")).intValue();
        if (monInt == 1){
            diversity_beta.setSelected(true);
            ((Map<String, Object>)listeModules.get("diversity_beta")).put("todo", 1);
        }else{
            diversity_beta.setSelected(false);
            ((Map<String, Object>)listeModules.get("diversity_beta")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("beta_group_significance")).get("todo")).intValue();
        if (monInt == 1.0){
            beta_group_significance.setSelected(true);
            ((Map<String, Object>)listeModules.get("beta_group_significance")).put("todo", 1);
        }else{
            beta_group_significance.setSelected(false);
            ((Map<String, Object>)listeModules.get("beta_group_significance")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("emperor_plot")).get("todo")).intValue();
        if (monInt == 1){
            emperor_plot.setSelected(true);
            ((Map<String, Object>)listeModules.get("emperor_plot")).put("todo", 1);
        }else{
            emperor_plot.setSelected(false);
            ((Map<String, Object>)listeModules.get("emperor_plot")).put("todo", 0);
        }
        
        int max_depth = ((Double)((Map<String, Object>)listeModules.get("alpha_rarefaction")).get("max_depth")).intValue();
        ((Map<String, Object>)listeModules.get("alpha_rarefaction")).put("max_depth", max_depth);
        monInt = ((Double)((Map<String, Object>)listeModules.get("alpha_rarefaction")).get("todo")).intValue();
        if (monInt == 1){
            alpha_rarefaction.setSelected(true);
            ((Map<String, Object>)listeModules.get("alpha_rarefaction")).put("todo", 1);
        }else{
            alpha_rarefaction.setSelected(false);
            ((Map<String, Object>)listeModules.get("alpha_rarefaction")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("classify_sklearn")).get("todo")).intValue();
        if (monInt == 1){
            classify_sklearn.setSelected(true);
            ((Map<String, Object>)listeModules.get("classify_sklearn")).put("todo", 1);
        }else{
            classify_sklearn.setSelected(false);
            ((Map<String, Object>)listeModules.get("classify_sklearn")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("filter_samples")).get("todo")).intValue();
        if (monInt == 1){
            filter_samples.setSelected(true);
            ((Map<String, Object>)listeModules.get("filter_samples")).put("todo", 1);
        }else{
            filter_samples.setSelected(false);
            ((Map<String, Object>)listeModules.get("filter_samples")).put("todo", 0);
        }
        
        List<Object> maListeTaxa = ((List<Object>)((Map<String, Object>)listeModules.get("taxa_collapse")).get("level"));
        List<Integer> nouvListe = new ArrayList<Integer>();
        if (!maListeTaxa.isEmpty()){
            for (Object o : maListeTaxa){
                nouvListe.add((Integer)(((Double)o).intValue()));
            }
            ((Map<String, Object>)listeModules.get("taxa_collapse")).remove("level");
            ((Map<String, Object>)listeModules.get("taxa_collapse")).put("level", nouvListe);
        }
        monInt = ((Double)((Map<String, Object>)listeModules.get("taxa_collapse")).get("todo")).intValue();
        if (monInt == 1){
            taxa_collapse.setSelected(true);
            ((Map<String, Object>)listeModules.get("taxa_collapse")).put("todo", 1);
        }else{
            taxa_collapse.setSelected(false);
            ((Map<String, Object>)listeModules.get("taxa_collapse")).put("todo", 0);
        }
        
        int min_freq = ((Double)((Map<String, Object>)listeModules.get("filter_features")).get("min_frequency")).intValue();
        ((Map<String, Object>)listeModules.get("filter_features")).put("min_frequency", min_freq);
        int min_samples = ((Double)((Map<String, Object>)listeModules.get("filter_features")).get("min_samples")).intValue();
        ((Map<String, Object>)listeModules.get("filter_features")).put("min_samples", min_samples);
        monInt = ((Double)((Map<String, Object>)listeModules.get("filter_features")).get("todo")).intValue();
        if (monInt == 1){
            filter_features.setSelected(true);
            ((Map<String, Object>)listeModules.get("filter_features")).put("todo", 1);
        }else{
            filter_features.setSelected(false);
            ((Map<String, Object>)listeModules.get("filter_features")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("ancom")).get("todo")).intValue();
        if (monInt == 1){
            ancom.setSelected(true);
            ((Map<String, Object>)listeModules.get("ancom")).put("todo", 1);
        }else{
            ancom.setSelected(false);
            ((Map<String, Object>)listeModules.get("ancom")).put("todo", 0);
        }
        
        int n_esti = ((Double)((Map<String, Object>)listeModules.get("classify_samples_ncv")).get("n_estimators")).intValue();
        ((Map<String, Object>)listeModules.get("classify_samples_ncv")).put("n_estimators", n_esti);
        int cv = ((Double)((Map<String, Object>)listeModules.get("classify_samples_ncv")).get("cv")).intValue();
        ((Map<String, Object>)listeModules.get("classify_samples_ncv")).put("cv", cv);
        monInt = ((Double)((Map<String, Object>)listeModules.get("classify_samples_ncv")).get("todo")).intValue();
        if (monInt == 1){
            classify_samples_ncv.setSelected(true);
            ((Map<String, Object>)listeModules.get("classify_samples_ncv")).put("todo", 1);
        }else{
            classify_samples_ncv.setSelected(false);
            ((Map<String, Object>)listeModules.get("classify_samples_ncv")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("picrust2_pipeline")).get("todo")).intValue();
        if (monInt == 1){
            picrust2_pipeline.setSelected(true);
            ((Map<String, Object>)listeModules.get("picrust2_pipeline")).put("todo", 1);
        }else{
            picrust2_pipeline.setSelected(false);
            ((Map<String, Object>)listeModules.get("picrust2_pipeline")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("picrust2_import")).get("todo")).intValue();
        if (monInt == 1){
            picrust2_import.setSelected(true);
            ((Map<String, Object>)listeModules.get("picrust2_import")).put("todo", 1);
        }else{
            picrust2_import.setSelected(false);
            ((Map<String, Object>)listeModules.get("picrust2_import")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("export_trimmed")).get("todo")).intValue();
        if (monInt == 1){
            export_trimmed.setSelected(true);
            ((Map<String, Object>)listeModules.get("export_trimmed")).put("todo", 1);
        }else{
            export_trimmed.setSelected(false);
            ((Map<String, Object>)listeModules.get("export_trimmed")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("export_table")).get("todo")).intValue();
        if (monInt == 1){
            export_table.setSelected(true);
            ((Map<String, Object>)listeModules.get("export_table")).put("todo", 1);
        }else{
            export_table.setSelected(false);
            ((Map<String, Object>)listeModules.get("export_table")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("stats_depth")).get("todo")).intValue();
        if (monInt == 1){
            stats_depth.setSelected(true);
            ((Map<String, Object>)listeModules.get("stats_depth")).put("todo", 1);
        }else{
            stats_depth.setSelected(false);
            ((Map<String, Object>)listeModules.get("stats_depth")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("metaphlan2")).get("todo")).intValue();
        if (monInt == 1){
            metaphlan2.setSelected(true);
            ((Map<String, Object>)listeModules.get("metaphlan2")).put("todo", 1);
        }else{
            metaphlan2.setSelected(false);
            ((Map<String, Object>)listeModules.get("metaphlan2")).put("todo", 0);
        }
        
        List<Object> maListeMeta = ((List<Object>)((Map<String, Object>)listeModules.get("metaphlan2_merge")).get("level"));
        List<Integer> nouvListeMeta = new ArrayList<Integer>();
        if (!maListeMeta.isEmpty()){
            for (Object o : maListeMeta){
                nouvListeMeta.add((Integer)(((Double)o).intValue()));
            }
            ((Map<String, Object>)listeModules.get("metaphlan2_merge")).remove("level");
            ((Map<String, Object>)listeModules.get("metaphlan2_merge")).put("level", nouvListeMeta);
        }
        monInt = ((Double)((Map<String, Object>)listeModules.get("metaphlan2_merge")).get("todo")).intValue();
        if (monInt == 1){
            metaphlan2_merge.setSelected(true);
            ((Map<String, Object>)listeModules.get("metaphlan2_merge")).put("todo", 1);
        }else{
            metaphlan2_merge.setSelected(false);
            ((Map<String, Object>)listeModules.get("metaphlan2_merge")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("metaphlan2_export")).get("todo")).intValue();
        if (monInt == 1){
            metaphlan2_export.setSelected(true);
            ((Map<String, Object>)listeModules.get("metaphlan2_export")).put("todo", 1);
        }else{
            metaphlan2_export.setSelected(false);
            ((Map<String, Object>)listeModules.get("metaphlan2_export")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("humann2")).get("todo")).intValue();
        if (monInt == 1){
            humann2.setSelected(true);
            ((Map<String, Object>)listeModules.get("humann2")).put("todo", 1);
        }else{
            humann2.setSelected(false);
            ((Map<String, Object>)listeModules.get("humann2")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("humann2_merge")).get("todo")).intValue();
        if (monInt == 1){
            humann2_merge.setSelected(true);
            ((Map<String, Object>)listeModules.get("humann2_merge")).put("todo", 1);
        }else{
            humann2_merge.setSelected(false);
            ((Map<String, Object>)listeModules.get("humann2_merge")).put("todo", 0);
        }
        
        int lda = ((Double)((Map<String, Object>)listeModules.get("lefse")).get("lda")).intValue();
        ((Map<String, Object>)listeModules.get("lefse")).put("lda", lda);
        monInt = ((Double)((Map<String, Object>)listeModules.get("lefse")).get("todo")).intValue();
        if (monInt == 1){
            lefse.setSelected(true);
            ((Map<String, Object>)listeModules.get("lefse")).put("todo", 1);
        }else{
            lefse.setSelected(false);
            ((Map<String, Object>)listeModules.get("lefse")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("maaslin2")).get("todo")).intValue();
        if (monInt == 1){
            maaslin2.setSelected(true);
            ((Map<String, Object>)listeModules.get("maaslin2")).put("todo", 1);
        }else{
            maaslin2.setSelected(false);
            ((Map<String, Object>)listeModules.get("maaslin2")).put("todo", 0);
        }
        
        int min_depth = ((Double)((Map<String, Object>)listeModules.get("variant_premap")).get("min_depth")).intValue();
        ((Map<String, Object>)listeModules.get("variant_premap")).put("min_depth", min_depth);
        monInt = ((Double)((Map<String, Object>)listeModules.get("variant_premap")).get("todo")).intValue();
        if (monInt == 1){
            variant_prema.setSelected(true);
            ((Map<String, Object>)listeModules.get("variant_premap")).put("todo", 1);
        }else{
            variant_prema.setSelected(false);
            ((Map<String, Object>)listeModules.get("variant_premap")).put("todo", 0);
        }
        
        int min_depth2 = ((Double)((Map<String, Object>)listeModules.get("variant_genrefs")).get("min_depth")).intValue();
        ((Map<String, Object>)listeModules.get("variant_genrefs")).put("min_depth", min_depth2);
        monInt = ((Double)((Map<String, Object>)listeModules.get("variant_genrefs")).get("todo")).intValue();
        if (monInt == 1){
            variant_genref.setSelected(true);
            ((Map<String, Object>)listeModules.get("variant_genrefs")).put("todo", 1);
        }else{
            variant_genref.setSelected(false);
            ((Map<String, Object>)listeModules.get("variant_genrefs")).put("todo", 0);
        }
        
        int min_base = ((Double)((Map<String, Object>)listeModules.get("variant_callvar")).get("min_base_quality")).intValue();
        ((Map<String, Object>)listeModules.get("variant_callvar")).put("min_base_quality", min_base);
        int min_mapping = ((Double)((Map<String, Object>)listeModules.get("variant_callvar")).get("min_mapping_quality")).intValue();
        ((Map<String, Object>)listeModules.get("variant_callvar")).put("min_mapping_quality", min_mapping);
        int min_depth3 = ((Double)((Map<String, Object>)listeModules.get("variant_callvar")).get("min_depth")).intValue();
        ((Map<String, Object>)listeModules.get("variant_callvar")).put("min_depth", min_depth3);
        monInt = ((Double)((Map<String, Object>)listeModules.get("variant_callvar")).get("todo")).intValue();
        if (monInt == 1){
            variant_callvar.setSelected(true);
            ((Map<String, Object>)listeModules.get("variant_callvar")).put("todo", 1);
        }else{
            variant_callvar.setSelected(false);
            ((Map<String, Object>)listeModules.get("variant_callvar")).put("todo", 0);
        }
        
        monInt = ((Double)((Map<String, Object>)listeModules.get("variant_gentable")).get("todo")).intValue();
        if (monInt == 1){
            variant_gentable.setSelected(true);
            ((Map<String, Object>)listeModules.get("variant_gentable")).put("todo", 1);
        }else{
            variant_gentable.setSelected(false);
            ((Map<String, Object>)listeModules.get("variant_gentable")).put("todo", 0);
        }
        
        List<Object> maListeVar = ((List<Object>)((Map<String, Object>)listeModules.get("variant_merge")).get("level"));
        List<Integer> nouvListeVar = new ArrayList<Integer>();
        if (!maListeVar.isEmpty()){
            for (Object o : maListeVar){
                nouvListeVar.add((Integer)(((Double)o).intValue()));
            }
            ((Map<String, Object>)listeModules.get("variant_merge")).remove("level");
            ((Map<String, Object>)listeModules.get("variant_merge")).put("level", nouvListeVar);
        }
        monInt = ((Double)((Map<String, Object>)listeModules.get("variant_merge")).get("todo")).intValue();
        if (monInt == 1){
            variant_merge.setSelected(true);
            ((Map<String, Object>)listeModules.get("variant_merge")).put("todo", 1);
        }else{
            variant_merge.setSelected(false);
            ((Map<String, Object>)listeModules.get("variant_merge")).put("todo", 0);
        }

    }
    
    /**
     * fonction qui initialise l'interface, appelée en premier
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        monGroupe = new ToggleGroup();
        monGroupe.getToggles().add(resistome);
        monGroupe.getToggles().add(microbiome);
        resistome.setSelected(true);
        

        final UnaryOperator<TextFormatter.Change> stringOnlyFilter1 = change -> { 
            final String text = change.getText(); 
            return (text.isEmpty() || text .matches("[A-Z]") ) ? change : null;
        };
        
        final TextFormatter<String> stringOnlyformatter1 = new TextFormatter(stringOnlyFilter1);
        primerforwardtxt.setTextFormatter(stringOnlyformatter1);  
        final TextFormatter<String> stringOnlyformatter2 = new TextFormatter(stringOnlyFilter1);
        primerreversetxt.setTextFormatter(stringOnlyformatter2);
        final TextFormatter<String> stringOnlyformatter3 = new TextFormatter(stringOnlyFilter1); 
        frontforwardtxt.setTextFormatter(stringOnlyformatter3);
        final TextFormatter<String> stringOnlyformatter4 = new TextFormatter(stringOnlyFilter1); 
        frontreversetxt.setTextFormatter(stringOnlyformatter4);
        final TextFormatter<String> stringOnlyformatter5 = new TextFormatter(stringOnlyFilter1);
        f_primertxt.setTextFormatter(stringOnlyformatter5);
        final TextFormatter<String> stringOnlyformatter6 = new TextFormatter(stringOnlyFilter1);
        r_primertxt.setTextFormatter(stringOnlyformatter6);
        final TextFormatter<String> stringOnlyformatter7 = new TextFormatter(stringOnlyFilter1);
        anywhereforwardtxt.setTextFormatter(stringOnlyformatter7);
        final TextFormatter<String> stringOnlyformatter8 = new TextFormatter(stringOnlyFilter1);
        anywherereversetxt.setTextFormatter(stringOnlyformatter8);
        final TextFormatter<String> stringOnlyformatter9 = new TextFormatter(stringOnlyFilter1);
        coupleVal1.setTextFormatter(stringOnlyformatter9);
        final TextFormatter<String> stringOnlyformatter10 = new TextFormatter(stringOnlyFilter1);
        coupleVal2.setTextFormatter(stringOnlyformatter10);

        if(replayok){
            // recuperation des valeurs pour fichiers fastQ
            List<String> listPath = (List)(listeModules.get("fastq")); 
            printLog(listPath);
            this.ctrl.setText("OK");
            this.ctrl.setStyle("-fx-font-weight: bold ;-fx-text-fill:green; -fx-background-color:#38ee00;");
            start.setDisable(false);

            Double dboverlap = ((Double)((Map<String,Object>)listeModules.get("cutadapt_trim_paired")).get("overlap"));
            overlaptxt.setText(""+dboverlap.intValue());
             
           
            primerforwardtxt.setText(((List)((Map<String,Object>)listeModules.get("cutadapt_trim_paired")).get("adapter_f")).get(0).toString());
            primerreversetxt.setText(((List)((Map<String,Object>)listeModules.get("cutadapt_trim_paired")).get("adapter_r")).get(0).toString());
            frontforwardtxt.setText(((List)((Map<String,Object>)listeModules.get("cutadapt_trim_paired")).get("front_f")).get(0).toString());
            frontreversetxt.setText(((List)((Map<String,Object>)listeModules.get("cutadapt_trim_paired")).get("front_r")).get(0).toString());
            // recupération des valeurs pour catadapt-trim paired 
            if (!((List)((Map<String,Object>)listeModules.get("cutadapt_trim_paired")).get("anywhere_f")).isEmpty()){
                anywhereforwardtxt.setText(((List)((Map<String,Object>)listeModules.get("cutadapt_trim_paired")).get("anywhere_f")).get(0).toString());
            }
            if (!((List)((Map<String,Object>)listeModules.get("cutadapt_trim_paired")).get("anywhere_r")).isEmpty()){
                anywherereversetxt.setText(((List)((Map<String,Object>)listeModules.get("cutadapt_trim_paired")).get("anywhere_r")).get(0).toString());
            }
            // recuperation des valeurs pour dada2_denoise_paired           
            
            Double dbtrunc_len_f = ((Double)((Map<String,Object>)listeModules.get("dada2_denoise_paired")).get("trunc_len_f")); 
            truncateforwardtxt.setText(""+dbtrunc_len_f.intValue());
            Double dbtrunc_len_r = ((Double)((Map<String,Object>)listeModules.get("dada2_denoise_paired")).get("trunc_len_r"));
            truncatereversetxt.setText(""+dbtrunc_len_r.intValue());
            Double dbperc_identity = ((Double)((Map<String,Object>)listeModules.get("dada2_denoise_paired")).get("perc_identity"));
            percentagetxt.setText(""+dbperc_identity);
            
            // recuperation des valeurs pour patient metadata
            String metaPath = (String)(listeModules.get("metadata"));
            if (!((String)listeModules.get("metadata")).isEmpty()){ 
                fmeta.setText(((String)listeModules.get("metadata")));
            }else{
                fmeta.setText("");
            }
            
            // recuperation des valeurs pour result
            String listResu = (String)(listeModules.get("result"));
            if (!((String)listeModules.get("result")).isEmpty()){ 
                fresu.setText(((String)listeModules.get("result")));
            }else{
                fresu.setText("");
            }
            
            //recuperation des valeurs pour classifier path
            String listePath = (String)((Map<String, Object>)listeModules.get("classifier")).get("path");
            if (!((String)((Map<String, Object>)listeModules.get("classifier")).get("path")).isEmpty()){ 
                classifpath.setText((String)((Map<String, Object>)listeModules.get("classifier")).get("path"));
            }else{
                classifpath.setText("");
            }
         
            // recuperation des valeurs pour classifier otus  
            String lisfilesotus = (String)((Map<String, Object>)listeModules.get("classifier")).get("otus");
            if (!((String)((Map<String, Object>)listeModules.get("classifier")).get("otus")).isEmpty()){ 
                classif.setText((String)((Map<String, Object>)listeModules.get("classifier")).get("otus"));
            }else{
                classif.setText("");
            }
         
             
            // recuperation des valeurs pour classifier taxon
            String listfilestaxon = (String)((Map<String, Object>)listeModules.get("classifier")).get("taxonomy");
            if (!((String)((Map<String, Object>)listeModules.get("classifier")).get("taxonomy")).isEmpty()){ 
                classiftaxon.setText((String)((Map<String, Object>)listeModules.get("classifier")).get("taxonomy"));
            } else{
                classiftaxon.setText("");
            }
         
        
            // recuperation du reste de classifier
            f_primertxt.setText((((Map<String,Object>)listeModules.get("classifier")).get("f_primer")).toString());
            f_primer_name_txt.setText((((Map<String,Object>)listeModules.get("classifier")).get("f_primer_name")).toString());
            r_primertxt.setText((((Map<String,Object>)listeModules.get("classifier")).get("r_primer")).toString());
            r_primer_name_txt.setText((((Map<String,Object>)listeModules.get("classifier")).get("r_primer_name")).toString());
            
            initialiseModulesReplay();
        }
        
        listeModulesDico = new HashMap<>();
        
        if(!replayok){
            listeModules = new HashMap<>();
            initialiseDico ();
        }
        
        innerMapCLASSIFIER = new HashMap<>();
        
        //listeChoixTab = new TableView<Choix>();
        colChoix = new TableColumn<Choix, String>("Choix");
        colChoix.setCellValueFactory(new PropertyValueFactory<Choix, String>("nomChoix"));
        colChoix.setMinWidth(200);
        listeChoixTab.getColumns().addAll(colChoix);
        
        listChoix= FXCollections.observableArrayList();
        listeChoixTab.getItems().addAll(listChoix);
        addButtonSuppDico();

    } 
    
    /**
     * vérifie que les nombres entrés sur le premier onglet sont bien des integer ou des double selon les valeurs attendues dans les champs
     * retourne true si pas d'erreurs
     */
    public boolean verifOKNbFirstTab(){
        boolean result = true;
        if (!isInt(overlaptxt.getText())){
            errorOverlap.setText(mustInt);
            result = false;
        }else{
            errorOverlap.setText("");
        }
        
        if (!isInt(truncateforwardtxt.getText())){
            errorTruncateForward.setText(mustInt);
            result = false;
        }else{
            errorTruncateForward.setText("");
        }
        
        if (!isInt(truncatereversetxt.getText())){
            errorTruncateReverse.setText(mustInt);
            result = false;
        }else{
            errorTruncateReverse.setText("");
        }
        
        if (!isValidFloat(percentagetxt.getText())){
            errorPercentageIdentity.setText(mustDouble);
            result = false;
            
        }else{
            if (Double.valueOf(percentagetxt.getText())<= 1.0){
                errorPercentageIdentity.setText("");
            }else{
                errorPercentageIdentity.setText("Must be under 1.0");
                result = false;  
            }
            
        }
        return result;
    }
    
    /*
    * fonction pour generer le JSON et recuperer la liste des valeurs dans l'onglet général + les valeurs des modules
    */
    @FXML 
    public void go (ActionEvent event) throws Exception {
        
        boolean canGo = verifOKNbFirstTab(); // vérifie que ce sont des integer ou des doubles de rentrés
        
        if (canGo){
            // LISTE DES VALEURS POUR tools_import
            HashMap<String, Integer>innerMaptool_import = new HashMap<>();
            innerMaptool_import.put("todo", 1);
            // LISTE DES VALEURS POUR cutadapt_trim_paired
            HashMap<String, Object>innerMapcutadapt_trim_paired = new HashMap<>();
            innerMapcutadapt_trim_paired.put("todo", 1);
            innerMapcutadapt_trim_paired.put("overlap",Integer.parseInt(overlaptxt.getText()));

            // recuperation en format listes pour les différentes amorces
            List<String> primerforwardlist = new ArrayList<>();
            primerforwardlist.add(primerforwardtxt.getText());
            innerMapcutadapt_trim_paired.put("adapter_f",primerforwardlist);

            List<String> primerreverselist = new ArrayList<>();
            primerreverselist.add(primerreversetxt.getText());
            innerMapcutadapt_trim_paired.put("adapter_r",primerreverselist);

            List<String> frontforwardlist = new ArrayList<>();
            frontforwardlist.add(frontforwardtxt.getText());
            innerMapcutadapt_trim_paired.put("front_f",frontforwardlist);

            List<String> frontreverselist = new ArrayList<>();
            frontreverselist.add(frontreversetxt.getText());
            innerMapcutadapt_trim_paired.put("front_r",frontreverselist);

            List<String> anywhereforwardlist= new ArrayList<>();
            if (!anywhereforwardtxt.getText().equals("")){
               anywhereforwardlist.add(anywhereforwardtxt.getText());
            }
            innerMapcutadapt_trim_paired.put("anywhere_f",anywhereforwardlist);

            List<String> anywherereverselist= new ArrayList<>();
            if (!anywherereversetxt.getText().equals("")){
              anywherereverselist.add(anywherereversetxt.getText());
            }
            innerMapcutadapt_trim_paired.put("anywhere_r",anywherereverselist);



            // LISTE DES VALEURS POUR demux_summarize
            HashMap<String, Integer>innerMapdemux_summarize = new HashMap<>();
            innerMapdemux_summarize.put("todo", 1);
            // LISTE DES VALEURS POUR dada2_denoise_paired
            HashMap<String, Object>innerMapdada2_denoise_paired = new HashMap<>();
            innerMapdada2_denoise_paired.put("todo", 1);
            innerMapdada2_denoise_paired.put("max_ee", 2000); 
            innerMapdada2_denoise_paired.put("trunc_q", 0);
            innerMapdada2_denoise_paired.put("trim_left_f", 0);
            innerMapdada2_denoise_paired.put("trim_left_r", 0);

            innerMapdada2_denoise_paired.put("trunc_len_f",Integer.parseInt(truncateforwardtxt.getText()));
            innerMapdada2_denoise_paired.put("trunc_len_r",Integer.parseInt(truncatereversetxt.getText()));
            innerMapdada2_denoise_paired.put("perc_identity",Double.valueOf(percentagetxt.getText()));

            // INSERT APRES LES FICHIERS FASTQ
            listeModules.put("tmp","/ANALYSE/microbio/tmp/");
            listeModules.put("core",24);


            // Liste des valeurs pour classifier
            //HashMap<String, Object>innerMapCLASSIFIER = new HashMap<>();
            // recuperation en format listes pour f_primer et r_primer
            List<String> forwardprimerlist = new ArrayList<>();
            forwardprimerlist.add(f_primertxt.getText());
            innerMapCLASSIFIER.put("f_primer", (f_primertxt.getText()));



            innerMapCLASSIFIER.put("f_primer_name",(f_primer_name_txt.getText()));
            innerMapCLASSIFIER.put("r_primer", (r_primertxt.getText()));
            innerMapCLASSIFIER.put("r_primer_name",(r_primer_name_txt.getText()));
            innerMapCLASSIFIER.put("otus",(classif.getText()));
            innerMapCLASSIFIER.put("path",(classifpath.getText()));
            innerMapCLASSIFIER.put("taxonomy",(classiftaxon.getText()));
            innerMapCLASSIFIER.put("todo", 1);
            innerMapCLASSIFIER.put("max_length", 600);


            listeModules.put("cutadapt_trim_paired",innerMapcutadapt_trim_paired);
            listeModules.put("tools_import", innerMaptool_import);
            listeModules.put("demux_summarize",innerMapdemux_summarize);
            listeModules.put("dada2_denoise_paired",innerMapdada2_denoise_paired);
            listeModules.put("classifier",innerMapCLASSIFIER);
            // recuperation des textes liés à l'ouverture d'une boite de dialogue
            listeModules.put("result", this.fresu.getText());  
            listeModules.put("metadata", this.fmeta.getText());
            createjson(listeModules,jsonfilename.getText());
            //testLinux();

        }
           
          
    }
   
    

}   