package androidx.lifecycle;

import android.os.Bundle;
import com.paoman.lema.MainActivity;
import java.util.Arrays;
import java.util.Map;
import p008b.C0231f;
import p053g5.C1687f;
import p053g5.C1691j;
import p102n1.AbstractC2710c;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p172w3.C3781e;
import p172w3.InterfaceC3780d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.l0 */
/* loaded from: classes.dex */
public final class C0198l0 implements InterfaceC3780d {

    /* renamed from: a */
    public final C3781e f852a;

    /* renamed from: b */
    public boolean f853b;

    /* renamed from: c */
    public Bundle f854c;

    /* renamed from: d */
    public final C1691j f855d;

    public C0198l0(C3781e c3781e, MainActivity mainActivity) {
        AbstractC3367j.m5100e(c3781e, "savedStateRegistry");
        this.f852a = c3781e;
        this.f855d = AbstractC2710c.m4327J(new C0196k0(mainActivity, 0));
    }

    @Override // p172w3.InterfaceC3780d
    /* renamed from: a */
    public final Bundle mo462a() {
        Bundle m5138i = AbstractC3393k.m5138i((C1687f[]) Arrays.copyOf(new C1687f[0], 0));
        Bundle bundle = this.f854c;
        if (bundle != null) {
            m5138i.putAll(bundle);
        }
        for (Map.Entry entry : ((C0200m0) this.f855d.getValue()).f857b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle mo462a = ((C0231f) ((C0188g0) entry.getValue()).f842a.f10324a).mo462a();
            if (!mo462a.isEmpty()) {
                AbstractC3367j.m5100e(str, "key");
                m5138i.putBundle(str, mo462a);
            }
        }
        this.f853b = false;
        return m5138i;
    }
}
