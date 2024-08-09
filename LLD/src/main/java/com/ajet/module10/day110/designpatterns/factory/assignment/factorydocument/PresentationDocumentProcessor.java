package com.ajet.module10.day110.designpatterns.factory.assignment.factorydocument;

public class PresentationDocumentProcessor {
    private String documentName;

    public PresentationDocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public DocumentType supportsType() {
        return DocumentType.PRESENTATION;
    }

    public void processDocument() {
        // Implement presentation document processing logic
        System.out.println("Processing a presentation document: " + getDocumentName());
        // Additional logic for presentation document processing
    }

    public void addSlide() {
        System.out.println("Adding a slide to the presentation.");
    }
}