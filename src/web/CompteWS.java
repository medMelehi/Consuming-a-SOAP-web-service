package web;

import service.BanqueServiceService;
import service.BanqueWS;

public class CompteWS {

	public static void main(String[] args) {
		BanqueWS stub = new BanqueServiceService().getBanqueWSPort();
		System.out.println(stub.getCompte((long) 1).getSolde());

	}

}
