package diSdk.step.parser;

import com.mxgraph.util.mxUtils;
import diSdk.step.AbstractStep;
import kettleExt.utils.JSONArray;
import kettleExt.utils.JSONObject;
import models.Step;
import models.StepProperty;
import org.pentaho.di.trans.step.StepMetaInterface;
import org.pentaho.di.trans.steps.checksum.CheckSumMeta;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.List;

public class CheckSum extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, Step step) throws Exception {

    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        return null;
    }

}

