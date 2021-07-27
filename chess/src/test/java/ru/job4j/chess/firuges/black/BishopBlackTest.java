package ru.job4j.chess.firuges.black;


import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void whenPositionTrue() {
        Figure bishopBlack = new BishopBlack(Cell.B1);
        Cell cell = bishopBlack.position();
        assertThat(cell, is(Cell.B1));
    }

    @Test
    public void whenWay3MovesThenLength3() {
        Figure bishopBlack = new BishopBlack(Cell.B2);
        Cell[] cells = bishopBlack.way(Cell.E5);
        assertThat(cells.length, is(3));
    }

    @Test
    public void testWayContains() {
        Figure bishopBlack = new BishopBlack(Cell.B2);
        Cell[] cells = bishopBlack.way(Cell.E5);
        assertThat(cells[2], is(Cell.E5));
    }

    @Test (expected = ImpossibleMoveException.class)
    public void whenDiagonalFalseThenException() {
        Figure bishopBlack = new BishopBlack(Cell.B2);
        Cell[] cells = bishopBlack.way(Cell.E4);
    }

    @Test
    public void whenB2copyOnB4thenB4() {
        Figure bishopBlack = new BishopBlack(Cell.B2);
        Figure bishopBlack2 = bishopBlack.copy(Cell.B4);
        Cell cell = bishopBlack2.position();
        assertThat(cell, is(Cell.B4));
    }
}