package oops.singletons;

public class AppConfiger {

	private AppConfiger() {
		
	}
      private static AppConfiger obj=new AppConfiger();
      
      
      public static AppConfiger get () {
    	  return obj;
      }
      
}
