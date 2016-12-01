package infixVisitors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.InfixExpression;

public abstract class InfixVisitor extends ASTVisitor {
	public boolean visit(InfixExpression node) {
		changeInfixNodeOperator(node);
		return false;
	}

	abstract void changeInfixNodeOperator(InfixExpression node);

	public static List<ASTVisitor> getInfixVisitors() {
		List<ASTVisitor> infixVisitors = new ArrayList<ASTVisitor>();

		// conditional boundary cases
		infixVisitors.add(new InfixVisitorGreaterEqualToGreater());
		infixVisitors.add(new InfixVisitorGreaterToGreaterEqual());
		infixVisitors.add(new InfixVisitorLessEqualToLess());
		infixVisitors.add(new InfixVisitorLessToLessEqual());

		// conditional negation cases
		infixVisitors.add(new InfixVisitorGreaterEqualToLess());
		infixVisitors.add(new InfixVisitorGreaterToLessEqual());
		infixVisitors.add(new InfixVisitorLessEqualToGreater());
		infixVisitors.add(new InfixVisitorLessToGreaterEqual());
		infixVisitors.add(new InfixVisitorAndToOr());
		infixVisitors.add(new InfixVisitorOrToAnd());
		infixVisitors.add(new InfixVisitorEqualToNotEqual());
		infixVisitors.add(new InfixVisitorNotEqualToEqual());

		// arithmetic operators
		infixVisitors.add(new InfixVisitorTimesToDivide());
		infixVisitors.add(new InfixVisitorDivideToTimes());
		infixVisitors.add(new InfixVisitorDivideToPlus());
		infixVisitors.add(new InfixVisitorDivideToMinus());
		infixVisitors.add(new InfixVisitorDivideToRemainder());
		infixVisitors.add(new InfixVisitorRemainderToTimes());
		infixVisitors.add(new InfixVisitorRemainderToDivide());
		infixVisitors.add(new InfixVisitorRemainderToPlus());
		infixVisitors.add(new InfixVisitorRemainderToMinus());
		infixVisitors.add(new InfixVisitorMinusToPlus());
		infixVisitors.add(new InfixVisitorMinusToTimes());
		infixVisitors.add(new InfixVisitorMinusToDivide());
		infixVisitors.add(new InfixVisitorMinusToRemainder());
		infixVisitors.add(new InfixVisitorPlusToMinus());
		infixVisitors.add(new InfixVisitorPlusToTimes());
		infixVisitors.add(new InfixVisitorPlusToDivide());
		infixVisitors.add(new InfixVisitorPlusToRemainder());
		

		return infixVisitors;
	}
}