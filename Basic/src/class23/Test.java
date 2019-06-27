package class23;

public class Test {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		System.out.println("------Creating Employee objects----");
		emp.salary=90000;
		emp.getPaid();
		
		System.out.println("------Creating ScrumTeam objects----");
		
		ScrumTeam st=new ScrumTeam();
		st.salary=1000000;
		st.getPaid();
		st.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		st.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		System.out.println("----Creating Developer pbject----");
		
		Developer dev=new Developer();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Spritbacklog";
		dev.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		
		
System.out.println("----Creating Developer pbject----");
		
		Tester ga=new Tester();
		ga.salary=120000;
		ga.getPaid();
		ga.artifacts="Spritbacklog";
		ga.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		ga.workOnArtifacts();
		ga.attendScrumMeetings();
		ga.test();
		
		
		FrontEnd fe=new FrontEnd();
		fe.salary=3000;
		fe.getPaid();
		fe.artifacts="Spritbacklog";
		fe.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		fe.workOnArtifacts();
		fe.attendScrumMeetings();
		fe.Html();
		
		System.out.println();
		
		BackEnd ba=new BackEnd();
		ba.salary=12000;
		ba.getPaid();
		ba.artifacts="Spritbacklog";
		ba.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.Sql();
	
	
		
		
		

	}

}
