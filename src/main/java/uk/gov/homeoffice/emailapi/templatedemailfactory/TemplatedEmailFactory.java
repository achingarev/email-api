package uk.gov.homeoffice.emailapi.templatedemailfactory;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import uk.gov.homeoffice.emailapi.entities.TemplatedEmail;
import uk.gov.homeoffice.emailapi.templatedemailfactory.addressparsing.InternetAddressParsingException;
import uk.gov.homeoffice.emailapi.templatedemailfactory.templating.TemplatePopulatorIOException;
import uk.gov.homeoffice.emailapi.templatedemailfactory.templating.TemplatePopulatorParsingException;

public interface TemplatedEmailFactory {
    Email build(TemplatedEmail templatedEmail)
        throws EmailException, TemplatePopulatorParsingException, TemplatePopulatorIOException,
        InternetAddressParsingException;
}
