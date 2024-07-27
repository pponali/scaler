package com.ajet.module10.day109.designpatterns.prototypeNregistry.assignment.prototypeinvoice;

public interface InvoicePrototypeRegistry {
    void addPrototype(Invoice user);

    Invoice getPrototype(InvoiceType type);

    Invoice clone(InvoiceType type);
}
