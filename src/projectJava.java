import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class projectJava extends JFrame {
    private JPanel mainPanel;
    private JFrame frame;

    private ImageIcon icon1;
    private ImageIcon icon2;

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu displayMenu;
    private JMenu helpMenu;

    private JMenuItem addItem;
    private JMenuItem exitItem;
    private JMenuItem resultItem;
    private JMenuItem aboutItem;

    private JPanel voteAreaPanel1;
    private JPanel voteAreaPanel2;
    private JPanel voteAreaPanel3;
    private JPanel resultAreaPanel;

    private JPanel menuPanel;
    private JLabel sidePanelLabel;

    // Presidential Candidates
    private JLabel presidentialHeader;
    private JLabel presidential1;
    private JLabel presidential1_Name;
    private JLabel presidential_1_Course;
    private JLabel presidential_1_Other;

    private JLabel presidential2;
    private JLabel presidential2_Name;
    private JLabel presidential_2_Course;
    private JLabel presidential_2_Other;

    // Secretarial Candidates
    private JLabel secretarialHeader;
    private JLabel secretarial1;
    private JLabel secretarial1_Name;
    private JLabel secretarial_1_Course;
    private JLabel secretarial_1_Other;

    private JLabel secretarial2;
    private JLabel secretarial2_Name;
    private JLabel secretarial_2_Course;
    private JLabel secretarial_2_Other;

    private JLabel secretarial3;
    private JLabel secretarial3_Name;
    private JLabel secretarial_3_Course;
    private JLabel secretarial_3_Other;

    // Treasury Candidates
    private JLabel treasuryHeader;
    private JLabel treasury1;
    private JLabel treasury1_Name;
    private JLabel treasury_1_Course;
    private JLabel treasury_1_Other;

    private JLabel treasury2;
    private JLabel treasury2_Name;
    private JLabel treasury_2_Course;
    private JLabel treasury_2_Other;


    private JButton presidentialButton;
    private JButton secretarialButton;
    private JButton treasurerButton;
    private JButton resultButton;

    private JButton voteButton1;
    private JButton voteButton2;
    private JButton voteButton3;
    private JButton voteButton4;
    private JButton voteButton5;
    private JButton voteButton6;
    private JButton voteButton7;

    private JButton discardButton1;
    private JButton discardButton2;
    private JButton discardButton3;


    // Results
    private JLabel resultHeader;

    // Presidential Candidate 1
    private JLabel resultPresident1;
    private JLabel resultPresident1_Name;
    private JLabel resultPresident_1_Course;
    private JLabel resultPresident_1_Other;
    private JLabel resultPresident_1_Category;
    private JLabel resultPresident_1_Votes;

    // Presidential Candidate 2
    private JLabel resultPresident2;
    private JLabel resultPresident2_Name;
    private JLabel resultPresident_2_Course;
    private JLabel resultPresident_2_Other;
    private JLabel resultPresident_2_Category;
    private JLabel resultPresident_2_Votes;

    // Secretarial Candidate 1
    private JLabel resultSecretary1;
    private JLabel resultSecretary1_Name;
    private JLabel resultSecretary_1_Course;
    private JLabel resultSecretary_1_Other;
    private JLabel resultSecretary_1_Category;
    private JLabel resultSecretary_1_Votes;

    // Secretarial Candidate 2
    private JLabel resultSecretary2;
    private JLabel resultSecretary2_Name;
    private JLabel resultSecretary_2_Course;
    private JLabel resultSecretary_2_Other;
    private JLabel resultSecretary_2_Category;
    private JLabel resultSecretary_2_Votes;

    // Secretarial Candidate 3
    private JLabel resultSecretary3;
    private JLabel resultSecretary3_Name;
    private JLabel resultSecretary_3_Course;
    private JLabel resultSecretary_3_Other;
    private JLabel resultSecretary_3_Category;
    private JLabel resultSecretary_3_Votes;

    // Treasury Candidate 1
    private JLabel resultTreasury1;
    private JLabel resultTreasury1_Name;
    private JLabel resultTreasury_1_Course;
    private JLabel resultTreasury_1_Other;
    private JLabel resultTreasury_1_Category;
    private JLabel resultTreasury_1_Votes;

    // Treasury Candidate 2
    private JLabel resultTreasury2;
    private JLabel resultTreasury2_Name;
    private JLabel resultTreasury_2_Course;
    private JLabel resultTreasury_2_Other;
    private JLabel resultTreasury_2_Category;
    private JLabel resultTreasury_2_Votes;


    // Votes
    private int voteCount1 = 0;
    private int voteCount2 = 0;
    private int voteCount3 = 0;
    private int voteCount4 = 0;
    private int voteCount5 = 0;
    private int voteCount6 = 0;
    private int voteCount7 = 0;


    public projectJava(){
        frame = new JFrame("Project Java");
        //p.setContentPane(new projectJava().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1000,622);



        icon1 = new ImageIcon("Icon.png");
        icon2 = new ImageIcon("Img1.png");

        // Menu bar
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        displayMenu = new JMenu("Display");
        helpMenu = new JMenu("Help");

        addItem = new JMenuItem("Add");
        exitItem = new JMenuItem("Exit");
        resultItem = new JMenuItem("Result");
        aboutItem = new JMenuItem("About");

        fileMenu.setMnemonic(KeyEvent.VK_F);
        displayMenu.setMnemonic(KeyEvent.VK_D);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        addItem.setMnemonic(KeyEvent.VK_A);
        exitItem.setMnemonic(KeyEvent.VK_E);
        resultItem.setMnemonic(KeyEvent.VK_R);
        aboutItem.setMnemonic(KeyEvent.VK_B);

        fileMenu.add(addItem);
        fileMenu.add(exitItem);
        displayMenu.add(resultItem);
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(displayMenu);
        menuBar.add(helpMenu);

        // Action Listeners
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        resultItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteAreaPanel1.setVisible(false);
                voteAreaPanel2.setVisible(false);
                voteAreaPanel3.setVisible(false);
                resultAreaPanel.setVisible(true);
            }
        });

        frame.setJMenuBar(menuBar);


        menuPanel = new JPanel();
        menuPanel.setBackground(new Color(0xdedede));
        menuPanel.setSize(200,572);
        menuPanel.setLayout(null);


        sidePanelLabel = new JLabel("Candidates");
        sidePanelLabel.setFont(new Font("Tahoma",Font.PLAIN, 14));
        sidePanelLabel.setBounds(27,40,186,36);
        sidePanelLabel.setForeground(Color.gray);


        presidentialButton = new JButton("Presidential");
        presidentialButton.setBounds(6,80,186,36);
        presidentialButton.setFocusPainted(false);
        presidentialButton.setHorizontalAlignment(SwingConstants.LEFT);
        presidentialButton.setFont(new Font("Tahoma",Font.PLAIN, 14));


        secretarialButton = new JButton("Secretary");
        secretarialButton.setBounds(6,115,186,36);
        secretarialButton.setFocusPainted(false);
        secretarialButton.setHorizontalAlignment(SwingConstants.LEFT);
        secretarialButton.setFont(new Font("Tahoma",Font.PLAIN, 14));


        treasurerButton = new JButton("Treasurer");
        treasurerButton.setBounds(6,150,186,36);
        treasurerButton.setFocusPainted(false);
        treasurerButton.setHorizontalAlignment(SwingConstants.LEFT);
        treasurerButton.setFont(new Font("Tahoma", Font.PLAIN, 14));


        resultButton = new JButton("Results");
        resultButton.setBounds(6,205,186,36);
        resultButton.setFocusPainted(false);
        resultButton.setHorizontalAlignment(SwingConstants.LEFT);
        resultButton.setFont(new Font("Tahoma",Font.PLAIN, 14));


        voteAreaPanel1 = new JPanel();
        voteAreaPanel1.setBounds(200,0, 800, 572);
        voteAreaPanel1.setLayout(null);


        // Voting Area Panel 1
        // Presidential Candidates

        presidentialHeader = new JLabel("Presidential Candidates");
        presidentialHeader.setBounds(50,18,350,50);
        presidentialHeader.setFont(new Font("Tahoma",Font.PLAIN, 25));

        discardButton1 = new JButton("Discard");
        discardButton1.setBounds(640,510,100,36);
        discardButton1.setFocusPainted(false);
        discardButton1.setFont(new Font("Tahoma",Font.PLAIN, 14));

        // Presidential Candidate 1

        presidential1 = new JLabel();
        presidential1.setBounds(50,88, 100, 100);
        presidential1.setIcon(icon1);

        presidential1_Name = new JLabel("Angelina Joe");
        presidential1_Name.setBounds(220,90,200,36);
        presidential1_Name.setFont(new Font("Tahoma",Font.PLAIN, 16));

        presidential_1_Course = new JLabel("Computer Science");
        presidential_1_Course.setBounds(400,90,200,36);
        presidential_1_Course.setFont(new Font("Tahoma",Font.PLAIN, 14));
        presidential_1_Course.setForeground(Color.gray);

        presidential_1_Other = new JLabel("9081734724D");
        presidential_1_Other.setBounds(400,115,200,36);
        presidential_1_Other.setFont(new Font("Tahoma",Font.PLAIN, 14));
        presidential_1_Other.setForeground(Color.gray);

        voteButton1 = new JButton("VOTE");
        voteButton1.setBounds(640,90,100,100);
        voteButton1.setFocusPainted(false);
        voteButton1.setFont(new Font("Tahoma",Font.PLAIN, 14));


        // Presidential Candidate 2

        presidential2 = new JLabel();
        presidential2.setBounds(50,225, 100, 100);
        presidential2.setIcon(icon1);

        presidential2_Name = new JLabel("McMillan Cloe");
        presidential2_Name.setBounds(220,227,200,36);
        presidential2_Name.setFont(new Font("Tahoma",Font.PLAIN, 16));

        presidential_2_Course = new JLabel("Department of Languages");
        presidential_2_Course.setBounds(400,227,200,36);
        presidential_2_Course.setFont(new Font("Tahoma",Font.PLAIN, 14));
        presidential_2_Course.setForeground(Color.gray);

        presidential_2_Other = new JLabel("8273649534F");
        presidential_2_Other.setBounds(400,252,200,36);
        presidential_2_Other.setFont(new Font("Tahoma",Font.PLAIN, 14));
        presidential_2_Other.setForeground(Color.gray);

        voteButton2 = new JButton("VOTE");
        voteButton2.setBounds(640,227,100,100);
        voteButton2.setFocusPainted(false);
        voteButton2.setFont(new Font("Tahoma",Font.PLAIN, 14));


        // Voting Area Panel 2
        // Secretarial Candidates

        voteAreaPanel2 = new JPanel();
        voteAreaPanel2.setBounds(200,0, 800, 572);
        voteAreaPanel2.setLayout(null);
        voteAreaPanel2.setVisible(false);

        discardButton2 = new JButton("Discard");
        discardButton2.setBounds(640,510,100,36);
        discardButton2.setFocusPainted(false);
        discardButton2.setFont(new Font("Tahoma",Font.PLAIN, 14));

        secretarialHeader = new JLabel("Secretarial Candidates");
        secretarialHeader.setBounds(50,18,350,50);
        secretarialHeader.setFont(new Font("Tahoma",Font.PLAIN, 25));


        // Secretarial Candidate 1

        secretarial1 = new JLabel();
        secretarial1.setBounds(50,88, 100, 100);
        secretarial1.setIcon(icon1);

        secretarial1_Name = new JLabel("George Mosh");
        secretarial1_Name.setBounds(220,90,200,36);
        secretarial1_Name.setFont(new Font("Tahoma",Font.PLAIN, 16));

        secretarial_1_Course = new JLabel("Explicit Culture");
        secretarial_1_Course.setBounds(400,90,200,36);
        secretarial_1_Course.setFont(new Font("Tahoma",Font.PLAIN, 14));
        secretarial_1_Course.setForeground(Color.gray);

        secretarial_1_Other = new JLabel("992734569H");
        secretarial_1_Other.setBounds(400,115,200,36);
        secretarial_1_Other.setFont(new Font("Tahoma",Font.PLAIN, 14));
        secretarial_1_Other.setForeground(Color.gray);

        voteButton3 = new JButton("VOTE");
        voteButton3.setBounds(640,90,100,100);
        voteButton3.setFocusPainted(false);
        voteButton3.setFont(new Font("Tahoma",Font.PLAIN, 14));


        // Secretarial Candidate 2

        secretarial2 = new JLabel();
        secretarial2.setBounds(50,225, 100, 100);
        secretarial2.setIcon(icon1);

        secretarial2_Name = new JLabel("Daisy Anderson");
        secretarial2_Name.setBounds(220,227,200,36);
        secretarial2_Name.setFont(new Font("Tahoma",Font.PLAIN, 16));

        secretarial_2_Course = new JLabel("Science and Mathematics");
        secretarial_2_Course.setBounds(400,227,200,36);
        secretarial_2_Course.setFont(new Font("Tahoma",Font.PLAIN, 14));
        secretarial_2_Course.setForeground(Color.gray);

        secretarial_2_Other = new JLabel("926498526M");
        secretarial_2_Other.setBounds(400,252,200,36);
        secretarial_2_Other.setFont(new Font("Tahoma",Font.PLAIN, 14));
        secretarial_2_Other.setForeground(Color.gray);

        voteButton4 = new JButton("VOTE");
        voteButton4.setBounds(640,227,100,100);
        voteButton4.setFocusPainted(false);
        voteButton4.setFont(new Font("Tahoma",Font.PLAIN, 14));


        // Secretarial Candidate 3

        secretarial3 = new JLabel();
        secretarial3.setBounds(50,362, 100, 100);
        secretarial3.setIcon(icon1);

        secretarial3_Name = new JLabel("Jane McCynthia");
        secretarial3_Name.setBounds(220,364,200,36);
        secretarial3_Name.setFont(new Font("Tahoma",Font.PLAIN, 16));

        secretarial_3_Course = new JLabel("Mathematics and Statistics");
        secretarial_3_Course.setBounds(400,364,200,36);
        secretarial_3_Course.setFont(new Font("Tahoma",Font.PLAIN, 14));
        secretarial_3_Course.setForeground(Color.gray);

        secretarial_3_Other = new JLabel("922345246E");
        secretarial_3_Other.setBounds(400,389,200,36);
        secretarial_3_Other.setFont(new Font("Tahoma",Font.PLAIN, 14));
        secretarial_3_Other.setForeground(Color.gray);

        voteButton5 = new JButton("VOTE");
        voteButton5.setBounds(640,364,100,100);
        voteButton5.setFocusPainted(false);
        voteButton5.setFont(new Font("Tahoma",Font.PLAIN, 14));


        // Voting Area Panel 3
        // Treasury Candidates

        voteAreaPanel3 = new JPanel();
        voteAreaPanel3.setBounds(200,0, 800, 572);
        voteAreaPanel3.setLayout(null);
        voteAreaPanel3.setVisible(false);

        discardButton3 = new JButton("Discard");
        discardButton3.setBounds(640,510,100,36);
        discardButton3.setFocusPainted(false);
        discardButton3.setFont(new Font("Tahoma",Font.PLAIN, 14));

        treasuryHeader = new JLabel("Treasury Candidates");
        treasuryHeader.setBounds(50,18,350,50);
        treasuryHeader.setFont(new Font("Tahoma",Font.PLAIN, 25));

        // Treasury Candidate 1

        treasury1 = new JLabel();
        treasury1.setBounds(50,88, 100, 100);
        treasury1.setIcon(icon1);

        treasury1_Name = new JLabel("Nick Rice Jonathan");
        treasury1_Name.setBounds(220,90,200,36);
        treasury1_Name.setFont(new Font("Tahoma",Font.PLAIN, 16));

        treasury_1_Course = new JLabel("Information Technologies");
        treasury_1_Course.setBounds(400,90,200,36);
        treasury_1_Course.setFont(new Font("Tahoma",Font.PLAIN, 14));
        treasury_1_Course.setForeground(Color.gray);

        treasury_1_Other = new JLabel("982647562T");
        treasury_1_Other.setBounds(400,115,200,36);
        treasury_1_Other.setFont(new Font("Tahoma",Font.PLAIN, 14));
        treasury_1_Other.setForeground(Color.gray);

        voteButton6 = new JButton("VOTE");
        voteButton6.setBounds(640,90,100,100);
        voteButton6.setFocusPainted(false);
        voteButton6.setFont(new Font("Tahoma",Font.PLAIN, 14));


        // Treasury Candidate 2

        treasury2 = new JLabel();
        treasury2.setBounds(50,225, 100, 100);
        treasury2.setIcon(icon1);

        treasury2_Name = new JLabel("Greg Johnson June");
        treasury2_Name.setBounds(220,227,200,36);
        treasury2_Name.setFont(new Font("Tahoma",Font.PLAIN, 16));

        treasury_2_Course = new JLabel("Department of S.T.E.M");
        treasury_2_Course.setBounds(400,227,200,36);
        treasury_2_Course.setFont(new Font("Tahoma",Font.PLAIN, 14));
        treasury_2_Course.setForeground(Color.gray);

        treasury_2_Other = new JLabel("972675643STEM");
        treasury_2_Other.setBounds(400,252,200,36);
        treasury_2_Other.setFont(new Font("Tahoma",Font.PLAIN, 14));
        treasury_2_Other.setForeground(Color.gray);

        voteButton7 = new JButton("VOTE");
        voteButton7.setBounds(640,227,100,100);
        voteButton7.setFocusPainted(false);
        voteButton7.setFont(new Font("Tahoma",Font.PLAIN, 14));


        // Results Area Panel 3 --------------------------------

        resultAreaPanel = new JPanel();
        resultAreaPanel.setBounds(200,0, 800, 572);
        resultAreaPanel.setLayout(null);
        //resultAreaPanel.setBackground(Color.orange);
        resultAreaPanel.setVisible(false);

        resultHeader = new JLabel("Candidates Results");
        resultHeader.setBounds(50,18,350,50);
        resultHeader.setFont(new Font("Tahoma",Font.PLAIN, 25));

        // Presidential Results Candidate 1
        resultPresident1 = new JLabel();
        resultPresident1.setBounds(50,60, 100, 100);
        resultPresident1.setIcon(icon2);

        resultPresident1_Name = new JLabel("Angelina Joe");
        resultPresident1_Name.setBounds(135,90,200,36);
        resultPresident1_Name.setFont(new Font("Tahoma",Font.PLAIN, 16));

        resultPresident_1_Course = new JLabel("Computer Science");
        resultPresident_1_Course.setBounds(355,90,200,36);
        resultPresident_1_Course.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultPresident_1_Course.setForeground(Color.gray);

        resultPresident_1_Other = new JLabel("9081734724D");
        resultPresident_1_Other.setBounds(355,112,200,36);
        resultPresident_1_Other.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultPresident_1_Other.setForeground(Color.gray);

        resultPresident_1_Category = new JLabel("Presidential");
        resultPresident_1_Category.setBounds(585,90,200,36);
        resultPresident_1_Category.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultPresident_1_Category.setForeground(Color.gray);

        resultPresident_1_Votes = new JLabel("0");
        resultPresident_1_Votes.setBounds(730,90,200,36);
        resultPresident_1_Votes.setFont(new Font("Tahoma",Font.PLAIN, 18));


        // Presidential Results Candidate 2
        resultPresident2 = new JLabel();
        resultPresident2.setBounds(50,125, 100, 100);
        resultPresident2.setIcon(icon2);

        resultPresident2_Name = new JLabel("McMillan Cloe");
        resultPresident2_Name.setBounds(135,155,200,36);
        resultPresident2_Name.setFont(new Font("Tahoma",Font.PLAIN, 16));

        resultPresident_2_Course = new JLabel("Department of Languages");
        resultPresident_2_Course.setBounds(355,155,200,36);
        resultPresident_2_Course.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultPresident_2_Course.setForeground(Color.gray);

        resultPresident_2_Other = new JLabel("8273649534F ");
        resultPresident_2_Other.setBounds(355,179,200,36);
        resultPresident_2_Other.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultPresident_2_Other.setForeground(Color.gray);

        resultPresident_2_Category = new JLabel("Presidential");
        resultPresident_2_Category.setBounds(585,155,200,36);
        resultPresident_2_Category.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultPresident_2_Category.setForeground(Color.gray);

        resultPresident_2_Votes = new JLabel("0");
        resultPresident_2_Votes.setBounds(730,155,200,36);
        resultPresident_2_Votes.setFont(new Font("Tahoma",Font.PLAIN, 18));

        // Secretarial Results Candidate 1
        resultSecretary1 = new JLabel();
        resultSecretary1.setBounds(50,190, 100, 100);
        resultSecretary1.setIcon(icon2);

        resultSecretary1_Name = new JLabel("George Mosh");
        resultSecretary1_Name.setBounds(135,220,200,36);
        resultSecretary1_Name.setFont(new Font("Tahoma",Font.PLAIN, 16));

        resultSecretary_1_Course = new JLabel("Explicit Culture");
        resultSecretary_1_Course.setBounds(355,220,200,36);
        resultSecretary_1_Course.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultSecretary_1_Course.setForeground(Color.gray);

        resultSecretary_1_Other = new JLabel("992734569H");
        resultSecretary_1_Other.setBounds(355,244,200,36);
        resultSecretary_1_Other.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultSecretary_1_Other.setForeground(Color.gray);

        resultSecretary_1_Category = new JLabel("Secretarial");
        resultSecretary_1_Category.setBounds(585,220,200,36);
        resultSecretary_1_Category.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultSecretary_1_Category.setForeground(Color.gray);

        resultSecretary_1_Votes = new JLabel("0");
        resultSecretary_1_Votes.setBounds(730,220,200,36);
        resultSecretary_1_Votes.setFont(new Font("Tahoma",Font.PLAIN, 18));

        // Secretarial Results Candidate 2
        resultSecretary2 = new JLabel();
        resultSecretary2.setBounds(50,255, 100, 100);
        resultSecretary2.setIcon(icon2);

        resultSecretary2_Name = new JLabel("Daisy Anderson");
        resultSecretary2_Name.setBounds(135,285,200,36);
        resultSecretary2_Name.setFont(new Font("Tahoma",Font.PLAIN, 16));

        resultSecretary_2_Course = new JLabel("Science and Mathematics");
        resultSecretary_2_Course.setBounds(355,285,200,36);
        resultSecretary_2_Course.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultSecretary_2_Course.setForeground(Color.gray);

        resultSecretary_2_Other = new JLabel("926498526M");
        resultSecretary_2_Other.setBounds(355,309,200,36);
        resultSecretary_2_Other.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultSecretary_2_Other.setForeground(Color.gray);

        resultSecretary_2_Category = new JLabel("Secretarial");
        resultSecretary_2_Category.setBounds(585,285,200,36);
        resultSecretary_2_Category.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultSecretary_2_Category.setForeground(Color.gray);

        resultSecretary_2_Votes = new JLabel("0");
        resultSecretary_2_Votes.setBounds(730,285,200,36);
        resultSecretary_2_Votes.setFont(new Font("Tahoma",Font.PLAIN, 18));

        // Secretarial Results Candidate 3
        resultSecretary3 = new JLabel();
        resultSecretary3.setBounds(50,320, 100, 100);
        resultSecretary3.setIcon(icon2);

        resultSecretary3_Name = new JLabel("Jane McCynthia");
        resultSecretary3_Name.setBounds(135,350,200,36);
        resultSecretary3_Name.setFont(new Font("Tahoma",Font.PLAIN, 16));

        resultSecretary_3_Course = new JLabel("Mathematics and Statistics");
        resultSecretary_3_Course.setBounds(355,350,200,36);
        resultSecretary_3_Course.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultSecretary_3_Course.setForeground(Color.gray);

        resultSecretary_3_Other = new JLabel("922345246E ");
        resultSecretary_3_Other.setBounds(355,374,200,36);
        resultSecretary_3_Other.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultSecretary_3_Other.setForeground(Color.gray);

        resultSecretary_3_Category = new JLabel("Secretarial");
        resultSecretary_3_Category.setBounds(585,350,200,36);
        resultSecretary_3_Category.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultSecretary_3_Category.setForeground(Color.gray);

        resultSecretary_3_Votes = new JLabel("0");
        resultSecretary_3_Votes.setBounds(730,350,200,36);
        resultSecretary_3_Votes.setFont(new Font("Tahoma",Font.PLAIN, 18));

        // Treasury Results Candidate 1
        resultTreasury1 = new JLabel();
        resultTreasury1.setBounds(50,385, 100, 100);
        resultTreasury1.setIcon(icon2);

        resultTreasury1_Name = new JLabel("Nick Rice Jonathan");
        resultTreasury1_Name.setBounds(135,415,200,36);
        resultTreasury1_Name.setFont(new Font("Tahoma",Font.PLAIN, 16));

        resultTreasury_1_Course = new JLabel("Information Technologies");
        resultTreasury_1_Course.setBounds(355,415,200,36);
        resultTreasury_1_Course.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultTreasury_1_Course.setForeground(Color.gray);

        resultTreasury_1_Other = new JLabel("982647562T");
        resultTreasury_1_Other.setBounds(355,439,200,36);
        resultTreasury_1_Other.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultTreasury_1_Other.setForeground(Color.gray);

        resultTreasury_1_Category = new JLabel("Treasury");
        resultTreasury_1_Category.setBounds(585,415,200,36);
        resultTreasury_1_Category.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultTreasury_1_Category.setForeground(Color.gray);

        resultTreasury_1_Votes = new JLabel("0");
        resultTreasury_1_Votes.setBounds(730,415,200,36);
        resultTreasury_1_Votes.setFont(new Font("Tahoma",Font.PLAIN, 18));

        // Treasury Results Candidate 2
        resultTreasury2 = new JLabel();
        resultTreasury2.setBounds(50,450, 100, 100);
        resultTreasury2.setIcon(icon2);

        resultTreasury2_Name = new JLabel("Greg Johnson June");
        resultTreasury2_Name.setBounds(135,480,200,36);
        resultTreasury2_Name.setFont(new Font("Tahoma",Font.PLAIN, 16));

        resultTreasury_2_Course = new JLabel("Department of S.T.E.M");
        resultTreasury_2_Course.setBounds(355,480,200,36);
        resultTreasury_2_Course.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultTreasury_2_Course.setForeground(Color.gray);

        resultTreasury_2_Other = new JLabel("972675643STEM");
        resultTreasury_2_Other.setBounds(355,504,200,36);
        resultTreasury_2_Other.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultTreasury_2_Other.setForeground(Color.gray);

        resultTreasury_2_Category = new JLabel("Treasury");
        resultTreasury_2_Category.setBounds(585,480,200,36);
        resultTreasury_2_Category.setFont(new Font("Tahoma",Font.PLAIN, 14));
        resultTreasury_2_Category.setForeground(Color.gray);

        resultTreasury_2_Votes = new JLabel("0");
        resultTreasury_2_Votes.setBounds(730,480,200,36);
        resultTreasury_2_Votes.setFont(new Font("Tahoma",Font.PLAIN, 18));






        // Action Listeners and Functions

        presidentialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteAreaPanel1.setVisible(true);
                voteAreaPanel2.setVisible(false);
                voteAreaPanel3.setVisible(false);
                resultAreaPanel.setVisible(false);
            }
        });

        secretarialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteAreaPanel1.setVisible(false);
                voteAreaPanel2.setVisible(true);
                resultAreaPanel.setVisible(false);
            }
        });

        treasurerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteAreaPanel1.setVisible(false);
                voteAreaPanel2.setVisible(false);
                voteAreaPanel3.setVisible(true);
                resultAreaPanel.setVisible(false);
            }
        });

        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteAreaPanel1.setVisible(false);
                voteAreaPanel2.setVisible(false);
                voteAreaPanel3.setVisible(false);
                resultAreaPanel.setVisible(true);
            }
        });


        // Vote Button Action Listeners
        voteButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteCount1++;
                resultPresident_1_Votes.setText(String.valueOf(voteCount1));
                voteButton1.setEnabled(false);
                voteButton2.setEnabled(false);
            }
        });

        voteButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteCount2++;
                resultPresident_2_Votes.setText(String.valueOf(voteCount2));
                voteButton1.setEnabled(false);
                voteButton2.setEnabled(false);
            }
        });

        voteButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteCount3++;
                resultSecretary_1_Votes.setText(String.valueOf(voteCount3));
                voteButton3.setEnabled(false);
                voteButton4.setEnabled(false);
                voteButton5.setEnabled(false);
            }
        });

        voteButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteCount4++;
                resultSecretary_2_Votes.setText(String.valueOf(voteCount4));
                voteButton3.setEnabled(false);
                voteButton4.setEnabled(false);
                voteButton5.setEnabled(false);
            }
        });

        voteButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteCount5++;
                resultSecretary_3_Votes.setText(String.valueOf(voteCount5));
                voteButton3.setEnabled(false);
                voteButton4.setEnabled(false);
                voteButton5.setEnabled(false);
            }
        });

        voteButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteCount6++;
                resultTreasury_1_Votes.setText(String.valueOf(voteCount6));
                voteButton6.setEnabled(false);
                voteButton7.setEnabled(false);
            }
        });

        voteButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteCount7++;
                resultTreasury_2_Votes.setText(String.valueOf(voteCount7));
                voteButton6.setEnabled(false);
                voteButton7.setEnabled(false);
            }
        });

        discardButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteButton1.setEnabled(true);
                voteButton2.setEnabled(true);

                if (voteCount1 > 0) {
                    voteCount1--;
                    resultPresident_1_Votes.setText(String.valueOf(voteCount1));
                }
                if (voteCount2 > 0) {
                    voteCount2--;
                    resultPresident_2_Votes.setText(String.valueOf(voteCount2));
                }
            }
        });

        discardButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteButton3.setEnabled(true);
                voteButton4.setEnabled(true);
                voteButton5.setEnabled(true);

                if (voteCount3 > 0) {
                    voteCount3--;
                    resultSecretary_1_Votes.setText(String.valueOf(voteCount3));
                }
                if (voteCount4 > 0) {
                    voteCount4--;
                    resultSecretary_2_Votes.setText(String.valueOf(voteCount4));
                }
                if (voteCount5 > 0) {
                    voteCount5--;
                    resultSecretary_3_Votes.setText(String.valueOf(voteCount5));
                }
            }
        });

        discardButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                voteButton6.setEnabled(true);
                voteButton7.setEnabled(true);

                if (voteCount6 > 0) {
                    voteCount6--;
                    resultTreasury_1_Votes.setText(String.valueOf(voteCount6));
                }
                if (voteCount7 > 0) {
                    voteCount7--;
                    resultTreasury_2_Votes.setText(String.valueOf(voteCount7));
                }
            }
        });





        voteAreaPanel1.add(presidentialHeader);
        voteAreaPanel1.add(discardButton1);

        // Presidential Candidate 1
        voteAreaPanel1.add(presidential1);
        voteAreaPanel1.add(presidential1_Name);
        voteAreaPanel1.add(presidential_1_Course);
        voteAreaPanel1.add(presidential_1_Other);
        voteAreaPanel1.add(voteButton1);

        // Presidential Candidate 2
        voteAreaPanel1.add(presidential2);
        voteAreaPanel1.add(presidential2_Name);
        voteAreaPanel1.add(presidential_2_Course);
        voteAreaPanel1.add(presidential_2_Other);
        voteAreaPanel1.add(voteButton2);


        voteAreaPanel2.add(secretarialHeader);
        voteAreaPanel2.add(discardButton2);

        // Secretarial Candidate 1
        voteAreaPanel2.add(secretarial1);
        voteAreaPanel2.add(secretarial1_Name);
        voteAreaPanel2.add(secretarial_1_Course);
        voteAreaPanel2.add(secretarial_1_Other);
        voteAreaPanel2.add(voteButton3);

        // Secretarial Candidate 2
        voteAreaPanel2.add(secretarial2);
        voteAreaPanel2.add(secretarial2_Name);
        voteAreaPanel2.add(secretarial_2_Course);
        voteAreaPanel2.add(secretarial_2_Other);
        voteAreaPanel2.add(voteButton4);

        // Secretarial Candidate 3
        voteAreaPanel2.add(secretarial3);
        voteAreaPanel2.add(secretarial3_Name);
        voteAreaPanel2.add(secretarial_3_Course);
        voteAreaPanel2.add(secretarial_3_Other);
        voteAreaPanel2.add(voteButton5);


        voteAreaPanel3.add(treasuryHeader);
        voteAreaPanel3.add(discardButton3);

        // Treasury Candidate 1
        voteAreaPanel3.add(treasury1);
        voteAreaPanel3.add(treasury1_Name);
        voteAreaPanel3.add(treasury_1_Course);
        voteAreaPanel3.add(treasury_1_Other);
        voteAreaPanel3.add(voteButton6);

        // Treasury Candidate 2
        voteAreaPanel3.add(treasury2);
        voteAreaPanel3.add(treasury2_Name);
        voteAreaPanel3.add(treasury_2_Course);
        voteAreaPanel3.add(treasury_2_Other);
        voteAreaPanel3.add(voteButton7);

        // Results
        resultAreaPanel.add(resultHeader);

        // Presidential Result Candidate 1
        resultAreaPanel.add(resultPresident1);
        resultAreaPanel.add(resultPresident1_Name);
        resultAreaPanel.add(resultPresident_1_Course);
        resultAreaPanel.add(resultPresident_1_Other);
        resultAreaPanel.add(resultPresident_1_Category);
        resultAreaPanel.add(resultPresident_1_Votes);

        // Presidential Result Candidate 2
        resultAreaPanel.add(resultPresident2);
        resultAreaPanel.add(resultPresident2_Name);
        resultAreaPanel.add(resultPresident_2_Course);
        resultAreaPanel.add(resultPresident_2_Other);
        resultAreaPanel.add(resultPresident_2_Category);
        resultAreaPanel.add(resultPresident_2_Votes);

        // Secretarial Result Candidate 1
        resultAreaPanel.add(resultSecretary1);
        resultAreaPanel.add(resultSecretary1_Name);
        resultAreaPanel.add(resultSecretary_1_Course);
        resultAreaPanel.add(resultSecretary_1_Other);
        resultAreaPanel.add(resultSecretary_1_Category);
        resultAreaPanel.add(resultSecretary_1_Votes);

        // Secretarial Result Candidate 2
        resultAreaPanel.add(resultSecretary2);
        resultAreaPanel.add(resultSecretary2_Name);
        resultAreaPanel.add(resultSecretary_2_Course);
        resultAreaPanel.add(resultSecretary_2_Other);
        resultAreaPanel.add(resultSecretary_2_Category);
        resultAreaPanel.add(resultSecretary_2_Votes);

        // Secretarial Result Candidate 3
        resultAreaPanel.add(resultSecretary3);
        resultAreaPanel.add(resultSecretary3_Name);
        resultAreaPanel.add(resultSecretary_3_Course);
        resultAreaPanel.add(resultSecretary_3_Other);
        resultAreaPanel.add(resultSecretary_3_Category);
        resultAreaPanel.add(resultSecretary_3_Votes);

        // Treasury Result Candidate 1
        resultAreaPanel.add(resultTreasury1);
        resultAreaPanel.add(resultTreasury1_Name);
        resultAreaPanel.add(resultTreasury_1_Course);
        resultAreaPanel.add(resultTreasury_1_Other);
        resultAreaPanel.add(resultTreasury_1_Category);
        resultAreaPanel.add(resultTreasury_1_Votes);

        // Treasury Result Candidate 2
        resultAreaPanel.add(resultTreasury2);
        resultAreaPanel.add(resultTreasury2_Name);
        resultAreaPanel.add(resultTreasury_2_Course);
        resultAreaPanel.add(resultTreasury_2_Other);
        resultAreaPanel.add(resultTreasury_2_Category);
        resultAreaPanel.add(resultTreasury_2_Votes);


        menuPanel.add(sidePanelLabel);
        menuPanel.add(resultButton);
        menuPanel.add(presidentialButton);
        menuPanel.add(secretarialButton);
        menuPanel.add(treasurerButton);


        frame.add(menuPanel);
        frame.add(voteAreaPanel1);
        frame.add(voteAreaPanel2);
        frame.add(voteAreaPanel3);
        frame.add(resultAreaPanel);
    }

    public static void main(String[] args) {
        new projectJava();
    }
}