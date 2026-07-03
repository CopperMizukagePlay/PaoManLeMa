package p186y3;

import android.os.Bundle;
import androidx.lifecycle.EnumC0203o;
import java.util.LinkedHashMap;
import p008b.C0226c0;
import p071j0.C2114a;
import p147t2.C3250c;
import p172w3.InterfaceC3782f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: y3.a */
/* loaded from: classes.dex */
public final class C3850a {

    /* renamed from: a */
    public final InterfaceC3782f f18077a;

    /* renamed from: b */
    public final C0226c0 f18078b;

    /* renamed from: e */
    public boolean f18081e;

    /* renamed from: f */
    public Bundle f18082f;

    /* renamed from: g */
    public boolean f18083g;

    /* renamed from: c */
    public final C3250c f18079c = new C3250c(13);

    /* renamed from: d */
    public final LinkedHashMap f18080d = new LinkedHashMap();

    /* renamed from: h */
    public boolean f18084h = true;

    public C3850a(InterfaceC3782f interfaceC3782f, C0226c0 c0226c0) {
        this.f18077a = interfaceC3782f;
        this.f18078b = c0226c0;
    }

    /* renamed from: a */
    public final void m5867a() {
        InterfaceC3782f interfaceC3782f = this.f18077a;
        if (interfaceC3782f.mo415g().f881c == EnumC0203o.f864f) {
            if (!this.f18081e) {
                this.f18078b.mo52a();
                interfaceC3782f.mo415g().m468a(new C2114a(1, this));
                this.f18081e = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }
}
