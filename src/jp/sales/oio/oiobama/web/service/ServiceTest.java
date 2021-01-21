package jp.sales.oio.oiobama.web.service;



public class ServiceTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OIOServer oios = new OIOServerService().getOIOServerPort();
		try {
			 System.out.println("20200301 reached first here----------------------------------------------------------------------------");	
		MContractBase name = oios.referCustomer("40850B");
			//xiaoxul@cn.ibm.com
			//MContractBase name = oios.referCustomer("xiaoxul@cn.ibm.com");	
		 System.out.println("MContractBase=="+name);
		 System.out.println("MContractBase=="+name.contractPattern);
		 System.out.println("MContractBase=="+name.cpno);
		 System.out.println("MContractBase=="+name.createUser);
		 System.out.println("MContractBase=="+name.custName);
		 System.out.println("20200301 reached here&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		 System.out.println("20200301 reached here######################################################################");
		}catch(Exception e){
			throw e;
		}
		finally {
			
		}
       
	}

}
