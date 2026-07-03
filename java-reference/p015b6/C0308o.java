package p015b6;

import java.util.Iterator;
import p024c6.C0437d;
import p098m5.AbstractC2589i;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b6.o */
/* loaded from: classes.dex */
public final class C0308o implements InterfaceC0305l {

    /* renamed from: a */
    public final /* synthetic */ int f1102a;

    /* renamed from: b */
    public final /* synthetic */ Object f1103b;

    public /* synthetic */ C0308o(int i7, Object obj) {
        this.f1102a = i7;
        this.f1103b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [m5.i, t5.e] */
    @Override // p015b6.InterfaceC0305l
    public final Iterator iterator() {
        switch (this.f1102a) {
            case 0:
                return AbstractC3393k.m5155z((AbstractC2589i) this.f1103b);
            case 1:
                return (Iterator) this.f1103b;
            case 2:
                return new C0437d((CharSequence) this.f1103b);
            case 3:
                return AbstractC3367j.m5103h((Object[]) this.f1103b);
            default:
                return ((Iterable) this.f1103b).iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0308o(InterfaceC3281e interfaceC3281e) {
        this.f1102a = 0;
        this.f1103b = (AbstractC2589i) interfaceC3281e;
    }
}
