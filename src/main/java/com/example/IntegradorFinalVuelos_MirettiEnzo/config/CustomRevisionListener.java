package com.example.IntegradorFinalVuelos_MirettiEnzo.config;

import com.example.IntegradorFinalVuelos_MirettiEnzo.entities.Revision.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {

    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }

}
