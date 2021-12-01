import java.awt.event.*;
import java.awt.Font;
import javax.swing.*;

class Counter extends JFrame
{
    JLabel count_lbl  = new JLabel("0");
    JButton add_btn   = new JButton("+");
    JButton min_btn   = new JButton("-");
    JButton reset_btn = new JButton("Reset");
    JButton exit_btn  = new JButton("Exit");
    int count=0;

    public Counter()
    {
        setSize(300,300);
        setResizable(false);
        setTitle("Java Counter");
        setLayout(null);

        //setbounds(x , y , w, h)
        count_lbl.setBounds(130,40,50,20);

        add_btn.setBounds  (20,120,100,30);
        reset_btn.setBounds(20,180,100,30);

        min_btn.setBounds  (170,120,100,30);
        exit_btn.setBounds (170,180,100,30);

        count_lbl.setFont(new Font("Cambria",Font.BOLD,25));
        add_btn.setFont(new Font("Cambria",Font.BOLD,20));
        min_btn.setFont(new Font("Cambria",Font.BOLD,20));
        reset_btn.setFont(new Font("Cambria",Font.BOLD,20));
        exit_btn.setFont(new Font("Cambria",Font.BOLD,20));

        add(count_lbl);
        add(add_btn);
        add(min_btn);
        add(reset_btn);
        add(exit_btn);

        add_btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				count++;
				count_lbl.setText(""+count);
				}
				});
		min_btn.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					if (count == 0)
					{
						 JOptionPane.showMessageDialog(rootPane,"Cannot Decrement than 0 ");
					}
					else{
						count--;
						count_lbl.setText(""+count);
					}
				}
				});
		reset_btn.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					int i=JOptionPane.showConfirmDialog(rootPane,"Are You Sure You Want to Reset?","WARNING MESSAGE!",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
					if(i==0)
					{
						count=0;
						count_lbl.setText(""+count);
						JOptionPane.showMessageDialog(rootPane,"Counter Reset successful");
					}
				}
				});
		exit_btn.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					int i=JOptionPane.showConfirmDialog(rootPane,"Are You Sure You Want to Exit?","WARNING MESSAGE!",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
					if(i==0)
					System.exit(0);
					}
				});

    }

    public static void main(String args[])
    {
        Counter c = new Counter();
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setVisible(true);

    }

}