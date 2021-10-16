package smev.Egisso;

public interface xmlFile {

    String xmlFromBase = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<QueryResult xmlns=\"urn://x-artefacts-smev-gov-ru/services/service-adapter/types\" xmlns:ns2=\"urn://x-artefacts-smev-gov-ru/services/service-adapter/types/faults\">\n" +
            "\t<smevMetadata>\n" +
            "\t\t<MessageId>50bda6ce-5232-11ea-9be6-fa163e24a723</MessageId>\n" +
            "\t\t<ReferenceMessageID>4d10a4b4-5232-11ea-ac7f-107b44198ce0</ReferenceMessageID>\n" +
            "\t\t<TransactionCode>4ce304e1-5232-11ea-8525-fa163e1007b9|00000000000000000000|J2EbOEsm1xDwOyW3MxgE8mqUqyqUWXQxm/CwDpCGhDmIAcB3mHJ4RBiaMgd4zGHqAlBEMCKuP2lvb60OOGqLGMxcKZihNY1XAbNfK0jIfLOdHIx12hnBHfWeZQ05RJbuU2ixq73GOGx8us3pan1nR410925ixglJYo9lGvIhoQSc7t/GSyXWiiGl8wKTWy/SKklpYY6RtEVA5IJ+J6BA02wrg30gcVgDS27IkiwbZhhxvv4ixGsRJRLYs/b2GpJ/aoWZPPxHq5tq3Csf32wAyCUHUYW3eJiMXAG+lmwwq8tbE34AU8MTTaRZLpULdFUvzyj7nz9SoJrxq8Nl1h8Qdw==</TransactionCode>\n" +
            "\t\t<OriginalMessageID>4d10a4b4-5232-11ea-ac7f-107b44198ce0</OriginalMessageID>\n" +
            "\t\t<Sender>emu</Sender>\n" +
            "\t\t<Recipient>001301_3T</Recipient>\n" +
            "\t</smevMetadata>\n" +
            "\t<Message xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ResponseMessageType\">\n" +
            "\t\t<messageType>PrimaryMessage</messageType>\n" +
            "\t\t<ResponseMetadata>\n" +
            "\t\t\t<clientId>4a0f8618-423b-452e-aeb1-89e4881fdb73</clientId>\n" +
            "\t\t\t<replyToClientId>c004133d-440c-4f40-8d05-5153e2b36946</replyToClientId>\n" +
            "\t\t</ResponseMetadata>\n" +
            "\t\t<ResponseContent>\n" +
            "\t\t\t<content>\n" +
            "\t\t\t\t<MessagePrimaryContent>\n" +
            "\t\t\t\t\t<ns3:response xmlns:ns3=\"urn://egisso-ru/msg/10.05.I/1.0.5\" xmlns=\"urn://x-artefacts-smev-gov-ru/services/message-exchange/types/basic/1.1\" xmlns:ns2=\"urn://x-artefacts-smev-gov-ru/services/message-exchange/types/1.1\" xmlns:ns4=\"urn://egisso-ru/types/package-protocol/1.0.3\" xmlns:ns5=\"urn://egisso-ru/types/package-result/1.0.2\" xmlns:ns6=\"urn://egisso-ru/types/record-result/1.0.3\">\n" +
            "\t\t\t\t\t\t<ns4:protocol>\n" +
            "\t\t\t\t\t\t\t<ns4:packageResult>\n" +
            "\t\t\t\t\t\t\t\t<ns5:packageID>bfd0b898-4dda-4744-85ad-6de310f25c88</ns5:packageID>\n" +
            "\t\t\t\t\t\t\t\t<ns5:packageType>Реестр ЛМСЗ</ns5:packageType>\n" +
            "\t\t\t\t\t\t\t\t<ns5:packageStatus>3</ns5:packageStatus>\n" +
            "\t\t\t\t\t\t\t\t<ns5:receivingTime>2019-02-20T22:24:00.190+03:00</ns5:receivingTime>\n" +
            "\t\t\t\t\t\t\t\t<ns5:startProcessTime>2019-02-20T22:24:00.198+03:00</ns5:startProcessTime>\n" +
            "\t\t\t\t\t\t\t\t<ns5:finishProcessTime>2019-02-20T22:24:00.361+03:00</ns5:finishProcessTime>\n" +
            "\t\t\t\t\t\t\t\t<ns5:recordNum>1</ns5:recordNum>\n" +
            "\t\t\t\t\t\t\t\t<ns5:recordNumSuccess>1</ns5:recordNumSuccess>\n" +
            "\t\t\t\t\t\t\t\t<ns4:errorRecords>\n" +
            "\t\t\t\t\t\t\t\t\t<ns6:recordResult>\n" +
            "\t\t\t\t\t\t\t\t\t\t<ns6:recID>accd7a02-bc4b-4bde-9dbd-a531d9fe9988</ns6:recID>\n" +
            "\t\t\t\t\t\t\t\t\t\t<ns6:recordOK>true</ns6:recordOK>\n" +
            "\t\t\t\t\t\t\t\t\t\t<ns6:messages>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<ns6:messageType>2</ns6:messageType>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<ns6:ruleCode>018</ns6:ruleCode>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<ns6:report>Комбинация меры и категории не найдена в перечне правил КМСЗ</ns6:report>\n" +
            "\t\t\t\t\t\t\t\t\t\t</ns6:messages>\n" +
            "\t\t\t\t\t\t\t\t\t\t<ns6:messages>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<ns6:messageType>2</ns6:messageType>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<ns6:ruleCode>018</ns6:ruleCode>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<ns6:report>Код 0101.01000000.02.0110.01.010101 отсутствует в КМСЗ</ns6:report>\n" +
            "\t\t\t\t\t\t\t\t\t\t</ns6:messages>\n" +
            "\t\t\t\t\t\t\t\t\t</ns6:recordResult>\n" +
            "\t\t\t\t\t\t\t\t</ns4:errorRecords>\n" +
            "\t\t\t\t\t\t\t</ns4:packageResult>\n" +
            "\t\t\t\t\t\t</ns4:protocol>\n" +
            "\t\t\t\t\t</ns3:response>\n" +
            "\t\t\t\t</MessagePrimaryContent>\n" +
            "\t\t\t</content>\n" +
            "\t\t</ResponseContent>\n" +
            "\t</Message>\n" +
            "</QueryResult>";

    String xmlFromFile = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<GetResponseResponse xmlns=\"urn://x-artefacts-smev-gov-ru/services/message-exchange/types/1.2\" xmlns:ns2=\"urn://x-artefacts-smev-gov-ru/services/message-exchange/types/basic/1.2\" xmlns:ns3=\"urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.2\">\n" +
            "\t<ResponseMessage>\n" +
            "\t\t<Response Id=\"SIGNED_BY_SMEV\">\n" +
            "\t\t\t<OriginalMessageId>4d10a4b4-5232-11ea-ac7f-107b44198ce0</OriginalMessageId>\n" +
            "\t\t\t<OriginalTransactionCode>4ce304e1-5232-11ea-8525-fa163e1007b9|00000000000000000000|J2EbOEsm1xDwOyW3MxgE8mqUqyqUWXQxm/CwDpCGhDmIAcB3mHJ4RBiaMgd4zGHqAlBEMCKuP2lvb60OOGqLGMxcKZihNY1XAbNfK0jIfLOdHIx12hnBHfWeZQ05RJbuU2ixq73GOGx8us3pan1nR410925ixglJYo9lGvIhoQSc7t/GSyXWiiGl8wKTWy/SKklpYY6RtEVA5IJ+J6BA02wrg30gcVgDS27IkiwbZhhxvv4ixGsRJRLYs/b2GpJ/aoWZPPxHq5tq3Csf32wAyCUHUYW3eJiMXAG+lmwwq8tbE34AU8MTTaRZLpULdFUvzyj7nz9SoJrxq8Nl1h8Qdw==</OriginalTransactionCode>\n" +
            "\t\t\t<SenderProvidedResponseData Id=\"SIGNED_BY_CALLER\">\n" +
            "\t\t\t\t<MessageID>50bda6ce-5232-11ea-9be6-fa163e24a723</MessageID>\n" +
            "\t\t\t\t<To>eyJzaWQiOjgyNDQwLCJtaWQiOiI0ZDEwYTRiNC01MjMyLTExZWEtYWM3Zi0xMDdiNDQxOThjZTAiLCJ0Y2QiOiI0Y2UzMDRlMS01MjMyLTExZWEtODUyNS1mYTE2M2UxMDA3Yjl8MDAwMDAwMDAwMDAwMDAwMDAwMDB8SjJFYk9Fc20xeER3T3lXM014Z0U4bXFVcXlxVVdYUXhtL0N3RHBDR2hEbUlBY0IzbUhKNFJCaWFNZ2Q0ekdIcUFsQkVNQ0t1UDJsdmI2ME9PR3FMR014Y0taaWhOWTFYQWJOZkswaklmTE9kSEl4MTJobkJIZldlWlEwNVJKYnVVMml4cTczR09HeDh1czNwYW4xblI0MTA5MjVpeGdsSllvOWxHdklob1FTYzd0L0dTeVhXaWlHbDh3S1RXeS9TS2tscFlZNlJ0RVZBNUlKK0o2QkEwMndyZzMwZ2NWZ0RTMjdJa2l3YlpoaHh2djRpeEdzUkpSTFlzL2IyR3BKL2FvV1pQUHhIcTV0cTNDc2YzMndBeUNVSFVZVzNlSmlNWEFHK2xtd3dxOHRiRTM0QVU4TVRUYVJaTHBVTGRGVXZ6eWo3bno5U29KcnhxOE5sMWg4UWR3PT0iLCJlb2wiOjAsInNsYyI6ImVnaXNzby1ydV9tc2dfMTAuMDUuSV8xLjAuMl9yZXF1ZXN0IiwibW5tIjoiMDAxMzAxXzNUIn0=</To>\n" +
            "\t\t\t\t<ns2:MessagePrimaryContent>\n" +
            "\t\t\t\t\t<ns3:response xmlns:ns3=\"urn://egisso-ru/msg/10.05.I/1.0.5\" xmlns=\"urn://x-artefacts-smev-gov-ru/services/message-exchange/types/basic/1.2\" xmlns:ns2=\"urn://x-artefacts-smev-gov-ru/services/message-exchange/types/1.2\" xmlns:ns4=\"urn://egisso-ru/types/package-protocol/1.0.3\" xmlns:ns5=\"urn://egisso-ru/types/package-result/1.0.2\" xmlns:ns6=\"urn://egisso-ru/types/record-result/1.0.3\">\n" +
            "\t\t\t\t\t\t<ns4:protocol>\n" +
            "\t\t\t\t\t\t\t<ns4:packageResult>\n" +
            "\t\t\t\t\t\t\t\t<ns5:packageID>bfd0b898-4dda-4744-85ad-6de310f25c88</ns5:packageID>\n" +
            "\t\t\t\t\t\t\t\t<ns5:packageType>Реестр ЛМСЗ</ns5:packageType>\n" +
            "\t\t\t\t\t\t\t\t<ns5:packageStatus>3</ns5:packageStatus>\n" +
            "\t\t\t\t\t\t\t\t<ns5:receivingTime>2019-02-20T22:24:00.190+03:00</ns5:receivingTime>\n" +
            "\t\t\t\t\t\t\t\t<ns5:startProcessTime>2019-02-20T22:24:00.198+03:00</ns5:startProcessTime>\n" +
            "\t\t\t\t\t\t\t\t<ns5:finishProcessTime>2019-02-20T22:24:00.361+03:00</ns5:finishProcessTime>\n" +
            "\t\t\t\t\t\t\t\t<ns5:recordNum>1</ns5:recordNum>\n" +
            "\t\t\t\t\t\t\t\t<ns5:recordNumSuccess>1</ns5:recordNumSuccess>\n" +
            "\t\t\t\t\t\t\t\t<ns4:errorRecords>\n" +
            "\t\t\t\t\t\t\t\t\t<ns6:recordResult>\n" +
            "\t\t\t\t\t\t\t\t\t\t<ns6:recID>accd7a02-bc4b-4bde-9dbd-a531d9fe9988</ns6:recID>\n" +
            "\t\t\t\t\t\t\t\t\t\t<ns6:recordOK>true</ns6:recordOK>\n" +
            "\t\t\t\t\t\t\t\t\t\t<ns6:messages>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<ns6:messageType>2</ns6:messageType>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<ns6:ruleCode>018</ns6:ruleCode>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<ns6:report>Комбинация меры и категории не найдена в перечне правил КМСЗ</ns6:report>\n" +
            "\t\t\t\t\t\t\t\t\t\t</ns6:messages>\n" +
            "\t\t\t\t\t\t\t\t\t\t<ns6:messages>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<ns6:messageType>2</ns6:messageType>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<ns6:ruleCode>018</ns6:ruleCode>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t<ns6:report>Код 0101.01000000.02.0110.01.010101 отсутствует в КМСЗ</ns6:report>\n" +
            "\t\t\t\t\t\t\t\t\t\t</ns6:messages>\n" +
            "\t\t\t\t\t\t\t\t\t</ns6:recordResult>\n" +
            "\t\t\t\t\t\t\t\t</ns4:errorRecords>\n" +
            "\t\t\t\t\t\t\t</ns4:packageResult>\n" +
            "\t\t\t\t\t\t</ns4:protocol>\n" +
            "\t\t\t\t\t</ns3:response>\n" +
            "\t\t\t\t</ns2:MessagePrimaryContent>\n" +
            "\t\t\t</SenderProvidedResponseData>\n" +
            "\t\t\t<MessageMetadata>\n" +
            "\t\t\t\t<MessageId>50bda6ce-5232-11ea-9be6-fa163e24a723</MessageId>\n" +
            "\t\t\t\t<MessageType>RESPONSE</MessageType>\n" +
            "\t\t\t\t<Sender>\n" +
            "\t\t\t\t\t<Mnemonic>emu</Mnemonic>\n" +
            "\t\t\t\t\t<HumanReadableName>emu</HumanReadableName>\n" +
            "\t\t\t\t</Sender>\n" +
            "\t\t\t\t<SendingTimestamp>2020-02-18T12:37:44.000+03:00</SendingTimestamp>\n" +
            "\t\t\t\t<DestinationName>unknown</DestinationName>\n" +
            "\t\t\t\t<Recipient>\n" +
            "\t\t\t\t\t<Mnemonic>001301_3T</Mnemonic>\n" +
            "\t\t\t\t\t<HumanReadableName>АИС «Социальный регистр» ВО</HumanReadableName>\n" +
            "\t\t\t\t</Recipient>\n" +
            "\t\t\t\t<SupplementaryData>\n" +
            "\t\t\t\t\t<DetectedContentTypeName>not detected</DetectedContentTypeName>\n" +
            "\t\t\t\t\t<InteractionType>NotDetected</InteractionType>\n" +
            "\t\t\t\t</SupplementaryData>\n" +
            "\t\t\t\t<DeliveryTimestamp>2020-02-18T12:41:51.290+03:00</DeliveryTimestamp>\n" +
            "\t\t\t\t<Status>responseIsDelivered</Status>\n" +
            "\t\t\t</MessageMetadata>\n" +
            "\t\t\t<SenderInformationSystemSignature>\n" +
            "\t\t\t\t<ds:Signature xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\" xmlns=\"urn://x-artefacts-smev-gov-ru/services/message-exchange/types/basic/1.2\" xmlns:ns2=\"urn://x-artefacts-smev-gov-ru/services/message-exchange/types/1.2\">\n" +
            "\t\t\t\t\t<ds:SignedInfo>\n" +
            "\t\t\t\t\t\t<ds:CanonicalizationMethod Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"/>\n" +
            "\t\t\t\t\t\t<ds:SignatureMethod Algorithm=\"urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-256\"/>\n" +
            "\t\t\t\t\t\t<ds:Reference URI=\"#SIGNED_BY_CALLER\">\n" +
            "\t\t\t\t\t\t\t<ds:Transforms>\n" +
            "\t\t\t\t\t\t\t\t<ds:Transform Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"/>\n" +
            "\t\t\t\t\t\t\t\t<ds:Transform Algorithm=\"urn://smev-gov-ru/xmldsig/transform\"/>\n" +
            "\t\t\t\t\t\t\t</ds:Transforms>\n" +
            "\t\t\t\t\t\t\t<ds:DigestMethod Algorithm=\"urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34112012-256\"/>\n" +
            "\t\t\t\t\t\t\t<ds:DigestValue>NxZ+qHwOztM75Yrith64Hwe4+0KDexHtUd2JwfwIzuc=</ds:DigestValue>\n" +
            "\t\t\t\t\t\t</ds:Reference>\n" +
            "\t\t\t\t\t</ds:SignedInfo>\n" +
            "\t\t\t\t\t<ds:SignatureValue>poDVD9Oq4NawVQzK1TOTlmGjBiR7gMMfST6XqKCofRumlToyN/QDF3efttLrM2zsHL2jx5NGCYmmiVXisfSRHg==</ds:SignatureValue>\n" +
            "\t\t\t\t\t<ds:KeyInfo>\n" +
            "\t\t\t\t\t\t<ds:X509Data>\n" +
            "\t\t\t\t\t\t\t<ds:X509Certificate>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</ds:X509Certificate>\n" +
            "\t\t\t\t\t\t</ds:X509Data>\n" +
            "\t\t\t\t\t</ds:KeyInfo>\n" +
            "\t\t\t\t</ds:Signature>\n" +
            "\t\t\t</SenderInformationSystemSignature>\n" +
            "\t\t</Response>\n" +
            "\t\t<SMEVSignature>\n" +
            "\t\t\t<ds:Signature xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\" xmlns=\"urn://x-artefacts-smev-gov-ru/services/message-exchange/types/basic/1.2\" xmlns:ns2=\"urn://x-artefacts-smev-gov-ru/services/message-exchange/types/1.2\">\n" +
            "\t\t\t\t<ds:SignedInfo>\n" +
            "\t\t\t\t\t<ds:CanonicalizationMethod Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"/>\n" +
            "\t\t\t\t\t<ds:SignatureMethod Algorithm=\"urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34102012-gostr34112012-256\"/>\n" +
            "\t\t\t\t\t<ds:Reference URI=\"#SIGNED_BY_SMEV\">\n" +
            "\t\t\t\t\t\t<ds:Transforms>\n" +
            "\t\t\t\t\t\t\t<ds:Transform Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"/>\n" +
            "\t\t\t\t\t\t\t<ds:Transform Algorithm=\"urn://smev-gov-ru/xmldsig/transform\"/>\n" +
            "\t\t\t\t\t\t</ds:Transforms>\n" +
            "\t\t\t\t\t\t<ds:DigestMethod Algorithm=\"urn:ietf:params:xml:ns:cpxmlsec:algorithms:gostr34112012-256\"/>\n" +
            "\t\t\t\t\t\t<ds:DigestValue>rhG3MzcTdkbybhi9Bojc4+E5SLrRHNUU6MhQnp0HwM8=</ds:DigestValue>\n" +
            "\t\t\t\t\t</ds:Reference>\n" +
            "\t\t\t\t</ds:SignedInfo>\n" +
            "\t\t\t\t<ds:SignatureValue>LRMaiH0gZa333DhM8i2fjkmkHHxl5xxcvb+HmOSB18K8SxkXexjsCP06VXIIskOPzG1YLrO/g3sG9uHl6vsLQg==</ds:SignatureValue>\n" +
            "\t\t\t\t<ds:KeyInfo>\n" +
            "\t\t\t\t\t<ds:X509Data>\n" +
            "\t\t\t\t\t\t<ds:X509Certificate>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</ds:X509Certificate>\n" +
            "\t\t\t\t\t</ds:X509Data>\n" +
            "\t\t\t\t</ds:KeyInfo>\n" +
            "\t\t\t</ds:Signature>\n" +
            "\t\t</SMEVSignature>\n" +
            "\t</ResponseMessage>\n" +
            "</GetResponseResponse>";

}
