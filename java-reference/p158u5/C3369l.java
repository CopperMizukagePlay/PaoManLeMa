package p158u5;

import p005a6.InterfaceC0110a;
import p005a6.InterfaceC0113d;
import p005a6.InterfaceC0114e;
import p028d2.AbstractC0489v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u5.l */
/* loaded from: classes.dex */
public final class C3369l extends AbstractC3370m implements InterfaceC0113d, InterfaceC0114e {
    public C3369l(String str, String str2) {
        super(1, AbstractC0489v.class, C3359b.f16430e, str, str2);
    }

    @Override // p158u5.AbstractC3360c
    /* renamed from: e */
    public final InterfaceC0110a mo3159e() {
        AbstractC3380w.f16452a.getClass();
        return this;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        m5106j();
        throw null;
    }

    @Override // p005a6.InterfaceC0113d
    public final Object get(Object obj) {
        throw null;
    }

    /* renamed from: j */
    public final void m5106j() {
        if (!this.f16445k) {
            InterfaceC0110a m5107h = m5107h();
            if (m5107h != this) {
                ((C3369l) ((InterfaceC0114e) m5107h)).m5106j();
                return;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }
}
