package p023c5;

import java.util.ArrayList;
import p022c4.C0392b;
import p022c4.C0399i;
import p022c4.C0401k;
import p022c4.C0406p;
import p022c4.InterfaceC0407q;
import p067i4.C2074g;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.m */
/* loaded from: classes.dex */
public class C0421m implements InterfaceC0407q {

    /* renamed from: a */
    public final C0399i f1444a;

    /* renamed from: b */
    public final ArrayList f1445b = new ArrayList();

    public C0421m(C0399i c0399i) {
        this.f1444a = c0399i;
    }

    @Override // p022c4.InterfaceC0407q
    /* renamed from: a */
    public final void mo882a(C0406p c0406p) {
        this.f1445b.add(c0406p);
    }

    /* renamed from: b */
    public C0392b mo902b(C0401k c0401k) {
        return new C0392b(new C2074g(c0401k));
    }
}
