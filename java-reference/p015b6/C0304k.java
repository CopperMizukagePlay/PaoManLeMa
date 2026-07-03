package p015b6;

import java.io.File;
import java.util.Iterator;
import p135r5.C3060g;
import p135r5.EnumC3062i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b6.k */
/* loaded from: classes.dex */
public final class C0304k implements InterfaceC0305l {

    /* renamed from: a */
    public final /* synthetic */ int f1096a = 1;

    /* renamed from: b */
    public final Object f1097b;

    /* renamed from: c */
    public final Object f1098c;

    public C0304k(File file) {
        AbstractC3367j.m5100e(file, "start");
        this.f1097b = file;
        this.f1098c = EnumC3062i.f15656e;
    }

    @Override // p015b6.InterfaceC0305l
    public final Iterator iterator() {
        switch (this.f1096a) {
            case 0:
                return new C0303j(this);
            default:
                return new C3060g(this);
        }
    }

    public C0304k(InterfaceC3277a interfaceC3277a, InterfaceC3279c interfaceC3279c) {
        this.f1097b = interfaceC3277a;
        this.f1098c = interfaceC3279c;
    }
}
