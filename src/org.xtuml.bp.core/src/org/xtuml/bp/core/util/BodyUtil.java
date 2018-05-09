package org.xtuml.bp.core.util;

import org.xtuml.bp.core.ActionHome_c;
import org.xtuml.bp.core.Action_c;
import org.xtuml.bp.core.Body_c;
import org.xtuml.bp.core.BridgeBody_c;
import org.xtuml.bp.core.Bridge_c;
import org.xtuml.bp.core.DerivedAttributeBody_c;
import org.xtuml.bp.core.DerivedBaseAttribute_c;
import org.xtuml.bp.core.FunctionBody_c;
import org.xtuml.bp.core.Function_c;
import org.xtuml.bp.core.MooreActionHome_c;
import org.xtuml.bp.core.OperationBody_c;
import org.xtuml.bp.core.Operation_c;
import org.xtuml.bp.core.ProvidedOperationBody_c;
import org.xtuml.bp.core.ProvidedOperation_c;
import org.xtuml.bp.core.ProvidedSignalBody_c;
import org.xtuml.bp.core.ProvidedSignal_c;
import org.xtuml.bp.core.RequiredOperationBody_c;
import org.xtuml.bp.core.RequiredOperation_c;
import org.xtuml.bp.core.RequiredSignalBody_c;
import org.xtuml.bp.core.RequiredSignal_c;
import org.xtuml.bp.core.StateActionBody_c;
import org.xtuml.bp.core.StateMachineState_c;
import org.xtuml.bp.core.TransitionActionBody_c;
import org.xtuml.bp.core.TransitionActionHome_c;
import org.xtuml.bp.core.Transition_c;
import org.xtuml.bp.core.common.NonRootModelElement;

public class BodyUtil {

	public static Body_c getBody( NonRootModelElement element ) {
        Body_c body = null;
        if ( element instanceof RequiredSignal_c ) {
            body = Body_c.getOneACT_ACTOnR698(RequiredSignalBody_c.getOneACT_RSBOnR684((RequiredSignal_c)element));
        }
        else if ( element instanceof RequiredOperation_c ) {
            body = Body_c.getOneACT_ACTOnR698(RequiredOperationBody_c.getOneACT_ROBOnR685((RequiredOperation_c)element));
        }
        else if ( element instanceof ProvidedSignal_c ) {
            body = Body_c.getOneACT_ACTOnR698(ProvidedSignalBody_c.getOneACT_PSBOnR686((ProvidedSignal_c)element));
        }
        else if ( element instanceof ProvidedOperation_c ) {
            body = Body_c.getOneACT_ACTOnR698(ProvidedOperationBody_c.getOneACT_POBOnR687((ProvidedOperation_c)element));
        }
        else if ( element instanceof Action_c ) {
            body = Body_c.getOneACT_ACTOnR698(StateActionBody_c.getOneACT_SABOnR691((Action_c)element));
            if ( null == body ) body = Body_c.getOneACT_ACTOnR698(TransitionActionBody_c.getOneACT_TABOnR688((Action_c)element));
        }
        else if ( element instanceof StateMachineState_c ) {
            body = Body_c.getOneACT_ACTOnR698(StateActionBody_c.getOneACT_SABOnR691(Action_c.getOneSM_ACTOnR514(ActionHome_c.getOneSM_AHOnR513(MooreActionHome_c.getOneSM_MOAHOnR511((StateMachineState_c)element)))));
        }
        else if ( element instanceof Transition_c ) {
            if ( null == body ) body = Body_c.getOneACT_ACTOnR698(TransitionActionBody_c.getOneACT_TABOnR688(Action_c.getOneSM_ACTOnR514(ActionHome_c.getOneSM_AHOnR513(TransitionActionHome_c.getOneSM_TAHOnR530((Transition_c)element)))));
        }
        else if ( element instanceof DerivedBaseAttribute_c ) {
            body = Body_c.getOneACT_ACTOnR698(DerivedAttributeBody_c.getManyACT_DABsOnR693((DerivedBaseAttribute_c)element));
        }
        else if ( element instanceof Function_c ) {
            body = Body_c.getOneACT_ACTOnR698(FunctionBody_c.getManyACT_FNBsOnR695((Function_c)element));
        }
        else if ( element instanceof Operation_c ) {
            body = Body_c.getOneACT_ACTOnR698(OperationBody_c.getManyACT_OPBsOnR696((Operation_c)element));
        }
        else if ( element instanceof Bridge_c ) {
            body = Body_c.getOneACT_ACTOnR698(BridgeBody_c.getManyACT_BRBsOnR697((Bridge_c)element));
        }
        return body;
    }

}
