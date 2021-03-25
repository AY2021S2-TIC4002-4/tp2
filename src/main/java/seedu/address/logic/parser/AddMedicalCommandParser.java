package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.AddAppointmentCommand;
import seedu.address.logic.commands.AddMedicalCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new FindCommand object
 */
public class AddMedicalCommandParser implements Parser<AddMedicalCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the FindCommand
     * and returns a FindCommand object for execution.
     *
     * @throws ParseException if the user input does not conform the expected format
     */
    public AddMedicalCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args.trim().split(" ")[0]);
            String s = args;

            String description = s.substring(s.indexOf("/d") + 3);

            return new AddMedicalCommand(index, description, "");
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddAppointmentCommand.MESSAGE_USAGE), pe);
        }
    }

}