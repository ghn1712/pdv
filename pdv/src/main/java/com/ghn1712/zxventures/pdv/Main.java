package com.ghn1712.zxventures.pdv;

import static spark.Spark.get;
import static spark.Spark.put;

import java.util.UUID;

import com.google.gson.Gson;

public class Main {
	private static Gson gson;

	public static void main(String[] args) {
		gson = new Gson();

		get("/pdv/:id", (req, res) -> Controller.getPDVById(UUID.fromString(req.params(":id"))), gson::toJson);

		put("/pdv", (req, res) -> {
			res.status(200);
			if(!Controller.addNewPDV(req.body())) res.status(500);
			return res;
		});
	}
}