package com.solid.l;

import com.solid.l.bad.BadGraphicsService;
import com.solid.l.bad.BadRectangle;
import com.solid.l.bad.BadSquare;

import good.GoodGraphicsService;
import good.GoodRectangle;
import good.GoodSquare;
import good.Shape;

public class LMain {
	public static void main(String[] args) {
		testBadL();
		testGoodL();
	}

	private static void testBadL() {
		BadRectangle actuallySquare = new BadSquare(20, 30);
		BadGraphicsService badGraphicsService = new BadGraphicsService();

		badGraphicsService.checkForArea(actuallySquare);
	}

	private static void testGoodL() {
		Shape rectangle = new GoodRectangle(29, 40);
		Shape square = new GoodSquare(20);
		GoodGraphicsService goodGraphicsService = new GoodGraphicsService();

		goodGraphicsService.checkForArea(rectangle);
		goodGraphicsService.checkForArea(square);

	}
}
