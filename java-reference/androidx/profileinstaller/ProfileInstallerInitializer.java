package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p087l2.ChoreographerFrameCallbackC2435b0;
import p147t2.C3250c;
import p193z3.InterfaceC3869b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC3869b {
    @Override // p193z3.InterfaceC3869b
    /* renamed from: a */
    public final List mo411a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p193z3.InterfaceC3869b
    /* renamed from: b */
    public final Object mo412b(Context context) {
        Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC2435b0(this, context.getApplicationContext()));
        return new C3250c(5);
    }
}
