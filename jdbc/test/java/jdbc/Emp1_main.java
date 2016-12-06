package jdbc;

public class Emp1_main {

	public static void main(String dufi[]){
		System.out.println("eq");
	//	Emp1 em1=new Emp1(ename, sno, eid, job, manager)
    Emp1DAO e1d=new Emp1DAO();
  //  System.out.println("sqe"+e1d.getData());
    e1d.getData();
	}
}
