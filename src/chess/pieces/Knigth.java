package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knigth extends ChessPiece {
	public Knigth(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "N";
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// above
		p.setValues(position.getRow() - 1, position.getColumn() -2);
			if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
			
		// below
		p.setValues(position.getRow() - 2, position.getColumn() - 1);
			if (getBoard().positionExists(p) && canMove(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}		
			
		// left
		p.setValues(position.getRow() - 2, position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}	
		
		// rigth
		p.setValues(position.getRow()- 1, position.getColumn() + 2);
			if (getBoard().positionExists(p) && canMove(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}	
			
		// NW
		p.setValues(position.getRow() + 1, position.getColumn() - 2);
			if (getBoard().positionExists(p) && canMove(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}	
			
		// Ne
		p.setValues(position.getRow() + 2, position.getColumn() + 1);
			if (getBoard().positionExists(p) && canMove(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}	
				
		// SW
		p.setValues(position.getRow() + 2, position.getColumn() - 1);
			if (getBoard().positionExists(p) && canMove(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}	
			
		// SE
		p.setValues(position.getRow() + 1, position.getColumn() - 2);
			if (getBoard().positionExists(p) && canMove(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}		
		return mat;
	}
}
