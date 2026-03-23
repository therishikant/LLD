package com.rishi.lld.proxy.protection;

import com.rishi.models.document.Document;
import com.rishi.models.document.RealDocument;

public class DocumentProxy implements Document {
    private final Document realDocument = new RealDocument();
    private final String role;

     public DocumentProxy(String role) {
        this.role = role;
    }

    @Override
    public void read() {
        if ("ADMIN".equals(this.role)) {
            System.out.println("Access granted. You have permission to read this document.");
            realDocument.read();
        } else {
            System.out.println("Access denied. You do not have permission to read this document.");
        }
    }
}
