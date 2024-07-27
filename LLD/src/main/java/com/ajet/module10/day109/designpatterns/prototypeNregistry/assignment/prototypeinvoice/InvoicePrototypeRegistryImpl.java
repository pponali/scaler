package com.ajet.module10.day109.designpatterns.prototypeNregistry.assignment.prototypeinvoice;


import java.util.HashMap;
import java.util.Map;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry {
    private final Map<InvoiceType, Invoice> prototypes = new HashMap<>();

    @Override
    public void addPrototype(Invoice invoice) {
        prototypes.put(invoice.getType(), invoice);
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return prototypes.get(type);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        Invoice prototype = prototypes.get(type);
        if (prototype != null) {
            return prototype.cloneObject();
        }
        return null;
    }
}
