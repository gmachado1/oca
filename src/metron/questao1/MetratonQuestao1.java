package metron.questao1;


public class MetratonQuestao1 {

	public String setString2NumberMessage(String message) {
		//String message = "SEMPRE ACESSO O DOJOPUZZLES", 
		String numSeq2Add = "", toReturn = "";
		// 77773367_7773302_222337777_777766606660366656667889999_9999555337777
		String aux;
		Character lastChar = null;
		for (int i = 0; i < message.length(); i++) {
			if (i > 0) {
				lastChar = toReturn.charAt(toReturn.length() - 1);
			}

			aux = Character.toString(message.toUpperCase().charAt(i));
			
			switch (aux) {
			case "A":
				numSeq2Add += 2;
				break;
			case "B":
				numSeq2Add += 22;
				break;
			case "C":
				numSeq2Add += 222;
				break;

			case "D":
				numSeq2Add += 3;
				break;
			case "E":
				numSeq2Add += 33;
				break;
			case "F":
				numSeq2Add += 333;
				break;

			case "G":
				numSeq2Add += 4;
				break;
			case "H":
				numSeq2Add += 44;
				break;
			case "I":
				numSeq2Add += 444;
				break;

			case "J":
				numSeq2Add += 5;
				break;
			case "K":
				numSeq2Add += 55;
				break;
			case "L":
				numSeq2Add += 555;
				break;

			case "M":
				numSeq2Add += 6;
				break;
			case "N":
				numSeq2Add += 66;
				break;
			case "O":
				numSeq2Add += 666;
				break;

			case "P":
				numSeq2Add += 7;
				break;
			case "Q":
				numSeq2Add += 77;
				break;
			case "R":
				numSeq2Add += 777;
				break;
			case "S":
				numSeq2Add += 7777;
				break;

			case "T":
				numSeq2Add += 8;
				break;
			case "U":
				numSeq2Add += 88;
				break;
			case "V":
				numSeq2Add += 888;
				break;

			case "W":
				numSeq2Add += 9;
				break;
			case "X":
				numSeq2Add += 99;
				break;
			case "Y":
				numSeq2Add += 999;
				break;
			case "Z":
				numSeq2Add += 9999;
				break;

			case " ":
				numSeq2Add += 0;
				break;
			// default:numSeq2Add+=0;break;
			}
			if (lastChar != null && lastChar.equals(numSeq2Add.charAt(numSeq2Add.length() - 1))) {
				toReturn += "_" + numSeq2Add;
			} else {
				toReturn += numSeq2Add;
			}
			// limpar pra próima iteracao
			numSeq2Add = "";

		}
		System.out.println(toReturn);
		return toReturn;
	}
}

