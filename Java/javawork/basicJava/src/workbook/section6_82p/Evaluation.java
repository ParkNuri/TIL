package workbook.section6_82p;

public class Evaluation {
	
	private double evaluationA;
	private double evaluationB;
	private double evaluationC;
	private double evaluationD;
	private double evaluationE;
	
	//Constructor----------------------------------------------------
	public Evaluation() {}

	public Evaluation(double evaluationA, double evaluationB, double evaluationC, double evaluationD, double evaluationE) {
		super();
		this.evaluationA = evaluationA;
		this.evaluationB = evaluationB;
		this.evaluationC = evaluationC;
		this.evaluationD = evaluationD;
		this.evaluationE = evaluationE;
	}

	//Method---------------------------------------------------------
	public double evaluationNumber() {
		double result = 0.0;
		result = ((double)evaluationA+evaluationB)/2*55+((double)evaluationC+evaluationD)/2*25+evaluationE*20;
		return result/100;
	}
	
	//Getter&Setter--------------------------------------------------
	
	public double getEvaluationA() {
		return evaluationA;
	}

	public void setEvaluationA(double evaluationA) {
		this.evaluationA = evaluationA;
	}

	public double getEvaluationB() {
		return evaluationB;
	}

	public void setEvaluationB(double evaluationB) {
		this.evaluationB = evaluationB;
	}

	public double getEvaluationC() {
		return evaluationC;
	}

	public void setEvaluationC(double evaluationC) {
		this.evaluationC = evaluationC;
	}

	public double getEvaluationD() {
		return evaluationD;
	}

	public void setEvaluationD(double evaluationD) {
		this.evaluationD = evaluationD;
	}

	public double getEvaluationE() {
		return evaluationE;
	}

	public void setEvaluationE(double evaluationE) {
		this.evaluationE = evaluationE;
	}
	
	
}
