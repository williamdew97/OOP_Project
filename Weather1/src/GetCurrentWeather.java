import java.util.Random;

public class GetCurrentWeather {

<<<<<<< HEAD
	public static String getCondition(Singleton.Weather weatherCondition) {
		String status;

		if (weatherCondition == Singleton.Weather.CLEAR) {

			status = "Clear";

		} else {

			status = "Severe";
		}

		return status;
	}

	public static int getWeather(Singleton.Weather weather12, Singleton.Season season) {

		int finalWeather = 0;
=======
	public static String getWeather(Singleton.Weather weather12, Singleton.Season season) {
		
		//String variable that will be sent to PreFlightStatus function 
		String conditionA;
>>>>>>> refs/remotes/origin/master

		Singleton.Season Cseason = season;

		Singleton.Weather weather1 = weather12;

		Random randomGenerator = new Random();

		int lowTemp = 0;

		int highTemp = 0;

		int result = 0;

		switch (Cseason) {

		case WINTER:

			switch (weather1) {

			case CLEAR:
<<<<<<< HEAD
				lowTemp = 25;
				
				highTemp = 51;
				
				System.out.println("Weather conditions are clear.");
				
=======
				Random randomGenerator = new Random();
				int lowW1 = 25;
				int highW1 = 51;
				int resultW1 = randomGenerator.nextInt(highW1 - lowW1) + lowW1;
				System.out.println(resultW1 + " degrees");
				System.out.println("Weather conditions are clear");
				return "clear";

>>>>>>> refs/remotes/origin/master
				break;

			case SEVERE_WEATHER:
<<<<<<< HEAD
				lowTemp = -31;
				
				highTemp = 0;
				
				System.out.println("Warning! Weather conditions are severe.");
				
=======
				Random randomGenerator1 = new Random();
				int lowW = -31;
				int highW = 0;
				int resultW = randomGenerator1.nextInt(highW - lowW) + lowW;
				System.out.println(resultW + " degrees");
				System.out.println("Warning weather conditions are severe. Blizzard approaching");
				return "severe";
>>>>>>> refs/remotes/origin/master
				break;
			}
			result = randomGenerator.nextInt(highTemp - lowTemp) + lowTemp;
			
			System.out.println(result + " degrees");
			
			finalWeather = result;

			break;

		case SPRING:

			switch (weather1) {

			case CLEAR:
<<<<<<< HEAD
				lowTemp = 70;
				
				highTemp = 99;
				
				System.out.println("Weather conditions are clear.");
				
=======
				Random randomGeneratorSP = new Random();
				int lowSp = 70;
				int highSp = 99;
				int resultSp = randomGeneratorSP.nextInt(highSp - lowSp) + lowSp;
				System.out.println(resultSp + " degrees");
				System.out.println("Weather conditions are clear");
				return "clear";
>>>>>>> refs/remotes/origin/master
				break;

			case SEVERE_WEATHER:
<<<<<<< HEAD
				lowTemp = 70;
				
				highTemp = 95;
				
				System.out.println("Warning! Weather conditions are severe.");
				
=======
				Random randomGeneratorS = new Random();
				int lowS = 70;
				int highS = 95;
				int resultS = randomGeneratorS.nextInt(highS - lowS) + lowS;
				System.out.println(resultS + " degrees");
				System.out.println("Weather is too severe for takeoff. Hurricane approaching");
				return "severe";
>>>>>>> refs/remotes/origin/master
				break;
			}
			result = randomGenerator.nextInt(highTemp - lowTemp) + lowTemp;
			
			System.out.println(result + " degrees");
			
			finalWeather = result;
			
			break;
		case SUMMER:

			switch (weather1) {

			case CLEAR:
<<<<<<< HEAD
				lowTemp = 80;
				
				highTemp = 110;
				
				System.out.println("Weather conditions are clear.");
				
=======
				Random randomGeneratorSu = new Random();
				int lowSu = 80;
				int highSu = 110;
				int resultSu = randomGeneratorSu.nextInt(highSu - lowSu) + lowSu;
				System.out.println(resultSu + " degrees");
				System.out.println("Weather is clear for takeoff");
				return "clear";
>>>>>>> refs/remotes/origin/master
				break;

			case SEVERE_WEATHER:
<<<<<<< HEAD
				lowTemp = 85;
				
				highTemp = 100;
				
				System.out.println("Warning! Weather conditions are severe.");
				
=======
				Random randomGeneratorSum = new Random();
				int lowSum = 85;
				int highSum = 100;
				int resultSum = randomGeneratorSum.nextInt(highSum - lowSum) + lowSum;
				System.out.println(resultSum + " degrees");
				System.out.println("Weather is too severe for takeoff. Tornado approaching");
				return "severe";
>>>>>>> refs/remotes/origin/master
				break;
			}
			result = randomGenerator.nextInt(highTemp - lowTemp) + lowTemp;
			
			System.out.println(result + " degrees");
			
			finalWeather = result;
			
			break;

		case FALL:

			switch (weather1) {

			case CLEAR:
				lowTemp = 75;
				
				highTemp = 90;
				
				System.out.println("Weather is clear for takeoff");
<<<<<<< HEAD
				
=======
				return "clear";
>>>>>>> refs/remotes/origin/master
				break;
			case SEVERE_WEATHER:
<<<<<<< HEAD
				lowTemp = 75;
				
				highTemp = 95;
				
				System.out.println("Warning! Weather conditions are severe.");
				
=======
				Random randomGeneratorFall = new Random();
				int lowFall = 75;
				int highFall = 95;
				int resultFall = randomGeneratorFall.nextInt(highFall - lowFall) + lowFall;
				System.out.println(resultFall + " degrees");
				System.out.println("Weather is too severe for takeoff. Hurricane approaching");
				return "severe";
>>>>>>> refs/remotes/origin/master
				break;
			}
			result = randomGenerator.nextInt(highTemp - lowTemp) + lowTemp;
			
			System.out.println(result + " degrees");
			
			finalWeather = result;
			
			break;
		}
		return finalWeather;
	}

}
