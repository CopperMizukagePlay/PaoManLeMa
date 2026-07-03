package p158u5;

import java.io.Serializable;
import p005a6.InterfaceC0110a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u5.c */
/* loaded from: classes.dex */
public abstract class AbstractC3360c implements InterfaceC0110a, Serializable {

    /* renamed from: e */
    public transient InterfaceC0110a f16431e;

    /* renamed from: f */
    public final Object f16432f;

    /* renamed from: g */
    public final Class f16433g;

    /* renamed from: h */
    public final String f16434h;

    /* renamed from: i */
    public final String f16435i;

    /* renamed from: j */
    public final boolean f16436j;

    public AbstractC3360c(Object obj, Class cls, String str, String str2, boolean z7) {
        this.f16432f = obj;
        this.f16433g = cls;
        this.f16434h = str;
        this.f16435i = str2;
        this.f16436j = z7;
    }

    /* renamed from: e */
    public abstract InterfaceC0110a mo3159e();

    /* renamed from: g */
    public final InterfaceC3361d m5091g() {
        boolean z7 = this.f16436j;
        Class cls = this.f16433g;
        if (z7) {
            AbstractC3380w.f16452a.getClass();
            return new C3371n(cls);
        }
        return AbstractC3380w.m5108a(cls);
    }
}
