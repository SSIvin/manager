package smev.ElementServices.Other;
/*     */
/*     */

import lombok.Data;
import smev.Enum.AttachmentTransferMethod;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/*     */
/*     */
/*     */

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentHeaderType", propOrder = {"id", "filePath", "passportId", "signaturePKCS7", "transferMethod"})
@Data
public class AttachmentHeaderType
{
  @XmlElement(name = "Id")
  protected String id;
  @XmlElement(required = true)
  protected String filePath;
  protected String passportId;
  @XmlElement(name = "SignaturePKCS7")
  protected byte[] signaturePKCS7;
  @XmlElement(name = "TransferMethod")
  protected AttachmentTransferMethod transferMethod;


}

