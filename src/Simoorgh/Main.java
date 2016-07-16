package Simoorgh;
import DB.*;
import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 EventQueue.invokeLater(new Runnable() {
				 public void run() {
					 try {
						 DataSource db = DataSource.getInstance();
						// UserCatalog.getInstance().setCurrentUser(db.getUser(1));
//						 new AddKnowledgeContentForm();
						// new KnowledgeSearchForm();
					 } catch (Exception e) {
						 e.printStackTrace();
					 }
				 }
			 });
		 } catch (Exception e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
	}

}
