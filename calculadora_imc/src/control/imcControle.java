package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.imcBean;
import view.MainViewer;

public class imcControle implements ActionListener{
	private MainViewer context;
	private imcBean imc;
	public imcControle() {
		
	}
	public imcControle(MainViewer context) {
		if (this.context == null)
			this.context = context;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		imc = new imcBean(context.getPesoTextField().getText() , context.getAlturaTextField().getText());
		
	
		context.getResultPane().setText(imc.getResult());
	}

}
