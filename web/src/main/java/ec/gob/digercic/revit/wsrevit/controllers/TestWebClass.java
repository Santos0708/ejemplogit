package ec.gob.digercic.revit.wsrevit.controllers;

import ec.gob.digercic.revit.wsrevit.model.TestEntity;

/**
 * Clase de test
 * @author christian.benalcazar
 *
 */
public class TestWebClass {
	public static void main(String args[]) {
		TestEntity test = new TestEntity("probando desde web...");
		System.out.println("test>>>" + test.getTestName());
	}

}
