package p014b5;

import java.lang.reflect.Array;
import p085l0.AbstractC2399q;
import p085l0.InterfaceC2343c;
import p096m3.C2572v;
import p100n.AbstractC2674q;
import p100n.C2636d0;
import p100n.InterfaceC2630b0;
import p100n.InterfaceC2676q1;
import p100n.InterfaceC2697y;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b5.b */
/* loaded from: classes.dex */
public final class C0288b implements InterfaceC2343c, InterfaceC2676q1 {

    /* renamed from: e */
    public final /* synthetic */ int f1046e;

    /* renamed from: f */
    public final int f1047f;

    /* renamed from: g */
    public int f1048g;

    /* renamed from: h */
    public final Object f1049h;

    public C0288b(int i7, int i8, int i9) {
        this.f1046e = i9;
        switch (i9) {
            case 3:
                this.f1049h = null;
                this.f1047f = i7;
                int i10 = i8 & 7;
                this.f1048g = i10 == 0 ? 8 : i10;
                return;
            default:
                this.f1049h = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i8, i7);
                this.f1047f = i7;
                this.f1048g = i8;
                return;
        }
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: a */
    public void mo88a(int i7, Object obj) {
        int i8;
        InterfaceC2343c interfaceC2343c = (InterfaceC2343c) this.f1049h;
        if (this.f1048g == 0) {
            i8 = this.f1047f;
        } else {
            i8 = 0;
        }
        interfaceC2343c.mo88a(i7 + i8, obj);
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: d */
    public void mo91d(Object obj) {
        this.f1048g++;
        ((InterfaceC2343c) this.f1049h).mo91d(obj);
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: e */
    public void mo92e() {
        ((InterfaceC2343c) this.f1049h).mo92e();
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: f */
    public void mo93f(int i7, Object obj) {
        int i8;
        InterfaceC2343c interfaceC2343c = (InterfaceC2343c) this.f1049h;
        if (this.f1048g == 0) {
            i8 = this.f1047f;
        } else {
            i8 = 0;
        }
        interfaceC2343c.mo93f(i7 + i8, obj);
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: h */
    public void mo95h(int i7, int i8, int i9) {
        int i10;
        if (this.f1048g == 0) {
            i10 = this.f1047f;
        } else {
            i10 = 0;
        }
        ((InterfaceC2343c) this.f1049h).mo95h(i7 + i10, i8 + i10, i9);
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: i */
    public Object mo96i() {
        return ((InterfaceC2343c) this.f1049h).mo96i();
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: j */
    public void mo97j(int i7, int i8) {
        int i9;
        InterfaceC2343c interfaceC2343c = (InterfaceC2343c) this.f1049h;
        if (this.f1048g == 0) {
            i9 = this.f1047f;
        } else {
            i9 = 0;
        }
        interfaceC2343c.mo97j(i7 + i9, i8);
    }

    @Override // p100n.InterfaceC2676q1
    /* renamed from: k */
    public int mo628k() {
        return this.f1048g;
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: l */
    public void mo629l(Object obj, InterfaceC3281e interfaceC3281e) {
        ((InterfaceC2343c) this.f1049h).mo629l(obj, interfaceC3281e);
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: n */
    public AbstractC2674q mo630n(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        return ((C2572v) this.f1049h).mo630n(j6, abstractC2674q, abstractC2674q2, abstractC2674q3);
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: o */
    public AbstractC2674q mo631o(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        return ((C2572v) this.f1049h).mo631o(j6, abstractC2674q, abstractC2674q2, abstractC2674q3);
    }

    @Override // p100n.InterfaceC2676q1
    /* renamed from: p */
    public int mo632p() {
        return this.f1047f;
    }

    @Override // p085l0.InterfaceC2343c
    /* renamed from: q */
    public void mo103q() {
        boolean z7;
        if (this.f1048g > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2399q.m3900c("OffsetApplier up called with no corresponding down");
        }
        this.f1048g--;
        ((InterfaceC2343c) this.f1049h).mo103q();
    }

    /* renamed from: r */
    public byte m633r(int i7, int i8) {
        return ((byte[][]) this.f1049h)[i8][i7];
    }

    /* renamed from: s */
    public void m634s(int i7, int i8, int i9) {
        ((byte[][]) this.f1049h)[i8][i7] = (byte) i9;
    }

    public String toString() {
        switch (this.f1046e) {
            case 0:
                int i7 = this.f1047f;
                int i8 = this.f1048g;
                StringBuilder sb = new StringBuilder((i7 * 2 * i8) + 2);
                for (int i9 = 0; i9 < i8; i9++) {
                    byte[] bArr = ((byte[][]) this.f1049h)[i9];
                    for (int i10 = 0; i10 < i7; i10++) {
                        byte b8 = bArr[i10];
                        if (b8 != 0) {
                            if (b8 != 1) {
                                sb.append("  ");
                            } else {
                                sb.append(" 1");
                            }
                        } else {
                            sb.append(" 0");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0288b() {
        this.f1046e = 3;
        this.f1049h = new C0288b[256];
        this.f1047f = 0;
        this.f1048g = 0;
    }

    public C0288b(InterfaceC2343c interfaceC2343c, int i7) {
        this.f1046e = 1;
        this.f1049h = interfaceC2343c;
        this.f1047f = i7;
    }

    public C0288b(int i7, int i8, InterfaceC2697y interfaceC2697y) {
        this.f1046e = 2;
        this.f1047f = i7;
        this.f1048g = i8;
        this.f1049h = new C2572v((InterfaceC2630b0) new C2636d0(i7, i8, interfaceC2697y));
    }
}
