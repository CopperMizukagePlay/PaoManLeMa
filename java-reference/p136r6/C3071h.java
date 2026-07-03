package p136r6;

import java.util.regex.Pattern;
import p006a7.C0138u;
import p006a7.InterfaceC0128k;
import p099m6.AbstractC2595c;
import p099m6.AbstractC2602f0;
import p099m6.C2621v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r6.h */
/* loaded from: classes.dex */
public final class C3071h extends AbstractC2602f0 {

    /* renamed from: e */
    public final String f15672e;

    /* renamed from: f */
    public final long f15673f;

    /* renamed from: g */
    public final C0138u f15674g;

    public C3071h(String str, long j6, C0138u c0138u) {
        this.f15672e = str;
        this.f15673f = j6;
        this.f15674g = c0138u;
    }

    @Override // p099m6.AbstractC2602f0
    /* renamed from: c */
    public final long mo4144c() {
        return this.f15673f;
    }

    @Override // p099m6.AbstractC2602f0
    /* renamed from: d */
    public final C2621v mo4145d() {
        String str = this.f15672e;
        if (str == null) {
            return null;
        }
        Pattern pattern = C2621v.f14160c;
        try {
            return AbstractC2595c.m4135i(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // p099m6.AbstractC2602f0
    /* renamed from: f */
    public final InterfaceC0128k mo4146f() {
        return this.f15674g;
    }
}
