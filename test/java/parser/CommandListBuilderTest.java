package parser;

import org.junit.Assert;
import org.junit.Test;
import rover.commands.ICommand;
import rover.commands.Move;
import rover.commands.TurnLeft;
import rover.commands.TurnRight;
import rover.parser.CommandListBuilder;

import java.util.List;

public class CommandListBuilderTest {

    @Test
    public void commandTurnsLeft() {
        //Given
        CommandListBuilder parser = new CommandListBuilder("L");

        //When
        List<ICommand> commands = parser.toCommands();

        //Then
        Assert.assertTrue(commands.get(0) instanceof TurnLeft);
        Assert.assertEquals(1, commands.size());
    }

    @Test
    public void commandTurnsRight() {
        //Given
        CommandListBuilder parser = new CommandListBuilder("R");

        //When
        List<ICommand> commands = parser.toCommands();

        //Then
        Assert.assertTrue(commands.get(0) instanceof TurnRight);
    }

    @Test
    public void commandMovesRover() {
        //Given
        CommandListBuilder parser = new CommandListBuilder("M");

        //When
        List<ICommand> commands = parser.toCommands();

        //Then
        Assert.assertTrue(commands.get(0) instanceof Move);
    }


    @Test
    public void emptyStringEqualsEmptyCommand() {
        //Given
        CommandListBuilder parser = new CommandListBuilder("");

        //When
        List<ICommand> commands = parser.toCommands();

        //Then
        Assert.assertEquals(0, commands.size());
    }


    @Test
    public void nullStringEqualsEmptyCommand() {
        //Given
        CommandListBuilder parser = new CommandListBuilder(null);

        //When
        List<ICommand> commands = parser.toCommands();

        //Then
        Assert.assertEquals(0, commands.size());
    }

    @Test
    public void commandListBuilderUpcasesStrings() {
        //Given
        CommandListBuilder parser = new CommandListBuilder("mM");

        //When
        List<ICommand> commands = parser.toCommands();

        //Then
        Assert.assertTrue(commands.get(0) instanceof Move);
        Assert.assertTrue(commands.get(1) instanceof Move);
    }

    @Test
    public void commandSequencePreservedInBuiltString() {
        //Given
        CommandListBuilder parser = new CommandListBuilder("MRL");

        //When
        List<ICommand> commands = parser.toCommands();

        //Then
        Assert.assertTrue(commands.get(0) instanceof Move);
        Assert.assertTrue(commands.get(1) instanceof TurnRight);
        Assert.assertTrue(commands.get(2) instanceof TurnLeft);
    }

}