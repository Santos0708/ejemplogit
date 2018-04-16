package ec.gob.digercic.revit.wsrevit.model;

public class TestEntity {
	
	public TestEntity(String testName) {
		this.testName = testName;
	}
	
	private String testName;
	
	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public static void main(String[] args) {
		System.out.println("test entidad");

	}

}
