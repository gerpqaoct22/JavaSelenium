package oct22.day2_Java;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class MyselfAccessSpecifier {

	public void communityPark()
	{
		System.out.println("Park - Community Park");
	}
	
	protected void gatedCommunityPark()
	{
		System.out.println("Park - Gated Community Park");
	}
	
	void swimmingPool()
	{
		System.out.println("Swimming Pool");
	}
	
	private void bedRoom()
	{
		System.out.println("My Bedroom");
	}
	
	public static void main(String[] args) {
		MyselfAccessSpecifier Myself = new MyselfAccessSpecifier();
		Myself.communityPark();
		Myself.gatedCommunityPark();
		Myself.swimmingPool();
		Myself.bedRoom();
	}

}
