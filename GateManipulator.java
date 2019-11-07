import java.util.ArrayList;

public class GateManipulator {
	ArrayList<Gates> gateList = new ArrayList();
	Gates a1 = new Gates("ADQ", "C3", (Integer) null, 1);
	Gates a2 = new Gates("ONT", "B10", (Integer) null, 2);
	Gates a3 = new Gates("PWM", "A7", (Integer) null, 3);
	Gates a4 = new Gates("ATL", "A8", (Integer) null, 4);
	Gates a5 = new Gates("ATL", "T3", (Integer) null, 5);
	Gates a6 = new Gates("ATL", "B13", (Integer) null, 6);
	Gates a7 = new Gates("IWA", "A13", (Integer) null, 7);
	Gates a8 = new Gates("FAT", "C11", (Integer) null, 8);
	Gates a9 = new Gates("ATL", "A1", (Integer) null, 9);
	Gates a10 = new Gates("OKC", "C8", (Integer) null, 10);
	Gates a11 = new Gates("HNL", "B7", (Integer) null, 11);
	Gates a12 = new Gates("ATL", "T6", (Integer) null, 12);
	Gates a13 = new Gates("ATL", "A18", (Integer) null, 13);
	Gates a14 = new Gates("ATL", "B3", (Integer) null, 14);
	Gates a15 = new Gates("ATL", "C15", (Integer) null, 15);
	Gates a16 = new Gates("JAN", "A5", (Integer) null, 16);
	Gates a17 = new Gates("ATL", "A14", (Integer) null, 17);
	Gates a18 = new Gates("ATL", "A15", (Integer) null, 18);
	Gates a19 = new Gates("ATL", "A9", (Integer) null, 19);
	Gates a20 = new Gates("ATL", "B1", (Integer) null, 20);
	Gates a21 = new Gates("IND", "B15", (Integer) null, 21);
	Gates a22 = new Gates("ATL", "B6", (Integer) null, 22);
	Gates a23 = new Gates("ERW", "C10", (Integer) null, 23);
	Gates a24 = new Gates("DFW", "B8", (Integer) null, 24);
	Gates a25 = new Gates("ATL", "C4", (Integer) null, 25);


	
	public void addingGates() {
		gateList.add(a1);
		gateList.add(a2);
		gateList.add(a3);
		gateList.add(a4);
		gateList.add(a5);
		gateList.add(a6);
		gateList.add(a7);
		gateList.add(a8);
		gateList.add(a9);
		gateList.add(a10);
		gateList.add(a11);
		gateList.add(a12);
		gateList.add(a13);
		gateList.add(a14);
		gateList.add(a15);
		gateList.add(a16);
		gateList.add(a17);
		gateList.add(a18);
		gateList.add(a19);
		gateList.add(a20);
		gateList.add(a21);
		gateList.add(a22);
		gateList.add(a23);
		gateList.add(a24);
		gateList.add(a25);
	}
	
	public void updatingGates(String aID, String gID, int pID, int eID) {
		int index = eID - 1; 
		if (eID == 1) {
			a1.setAirportID(aID);
			a1.setGateID(gID);
			a1.setPlaneID(pID);
			a1.setExpectedPlaneID(eID);
			gateList.set(index, a1);
		}
		if (eID == 2) {
			a2.setAirportID(aID);
			a2.setGateID(gID);
			a2.setPlaneID(pID);
			a2.setExpectedPlaneID(eID);
			gateList.set(index, a2);
		}
		if (eID == 3) {
			a3.setAirportID(aID);
			a3.setGateID(gID);
			a3.setPlaneID(pID);
			a3.setExpectedPlaneID(eID);
			gateList.set(index, a3);
		}
		if (eID == 4) {
			a4.setAirportID(aID);
			a4.setGateID(gID);
			a4.setPlaneID(pID);
			a4.setExpectedPlaneID(eID);
			gateList.set(index, a4);
		}
		if (eID == 5) {
			a5.setAirportID(aID);
			a5.setGateID(gID);
			a5.setPlaneID(pID);
			a5.setExpectedPlaneID(eID);
			gateList.set(index, a5);
		}
		if (eID == 6) {
			a6.setAirportID(aID);
			a6.setGateID(gID);
			a6.setPlaneID(pID);
			a6.setExpectedPlaneID(eID);
			gateList.set(index, a6);
		}
		if (eID == 7) {
			a7.setAirportID(aID);
			a7.setGateID(gID);
			a7.setPlaneID(pID);
			a7.setExpectedPlaneID(eID);
			gateList.set(index, a7);
		}
		if (eID == 8) {
			a8.setAirportID(aID);
			a8.setGateID(gID);
			a8.setPlaneID(pID);
			a8.setExpectedPlaneID(eID);
			gateList.set(index, a8);
		}
		if (eID == 9) {
			a9.setAirportID(aID);
			a9.setGateID(gID);
			a9.setPlaneID(pID);
			a9.setExpectedPlaneID(eID);
			gateList.set(index, a9);
		}
		if (eID == 10) {
			a10.setAirportID(aID);
			a10.setGateID(gID);
			a10.setPlaneID(pID);
			a10.setExpectedPlaneID(eID);
			gateList.set(index, a10);
		}
	}
}
