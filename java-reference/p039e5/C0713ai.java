package p039e5;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ai */
/* loaded from: classes.dex */
public final class C0713ai extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f2409i = 1;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2425y0 f2410j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f2411k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2425y0 f2412l;

    /* renamed from: m */
    public final /* synthetic */ Context f2413m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC2425y0 f2414n;

    /* renamed from: o */
    public final /* synthetic */ Parcelable f2415o;

    /* renamed from: p */
    public final /* synthetic */ Object f2416p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0713ai(Context context, InterfaceC2313c interfaceC2313c, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, C3469p c3469p) {
        super(2, interfaceC2313c);
        this.f2410j = interfaceC2425y0;
        this.f2411k = interfaceC2425y02;
        this.f2412l = interfaceC2425y03;
        this.f2413m = context;
        this.f2415o = c3469p;
        this.f2414n = interfaceC2425y04;
        this.f2416p = interfaceC2425y05;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f2409i) {
            case 0:
                return ((C0713ai) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                C0713ai c0713ai = (C0713ai) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m = C1694m.f10482a;
                c0713ai.mo29m(c1694m);
                return c1694m;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f2409i) {
            case 0:
                return new C0713ai((Intent) this.f2415o, this.f2413m, (InterfaceC3277a) this.f2416p, this.f2410j, this.f2411k, this.f2412l, this.f2414n, interfaceC2313c);
            default:
                C3469p c3469p = (C3469p) this.f2415o;
                return new C0713ai(this.f2413m, interfaceC2313c, this.f2410j, this.f2411k, this.f2412l, this.f2414n, (InterfaceC2425y0) this.f2416p, c3469p);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
    
        if (r13 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cc, code lost:
    
        if (r13 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d2  */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        C1362vb c1362vb;
        C1362vb m1648B3;
        String obj2;
        C1362vb m1875w3;
        int i7 = this.f2409i;
        C1694m c1694m = C1694m.f10482a;
        Object obj3 = this.f2416p;
        InterfaceC2425y0 interfaceC2425y0 = this.f2414n;
        Parcelable parcelable = this.f2415o;
        Context context = this.f2413m;
        InterfaceC2425y0 interfaceC2425y02 = this.f2411k;
        InterfaceC2425y0 interfaceC2425y03 = this.f2410j;
        InterfaceC2425y0 interfaceC2425y04 = this.f2412l;
        switch (i7) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                Intent intent = (Intent) parcelable;
                if (intent != null) {
                    float f7 = AbstractC1092mk.f5952h;
                    if (!AbstractC3367j.m5096a(intent.getAction(), "android.intent.action.MAIN")) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (stringExtra == null || (c1362vb = AbstractC1092mk.m1875w3(stringExtra)) == null) {
                            ClipData clipData = intent.getClipData();
                            if (clipData != null) {
                                int itemCount = clipData.getItemCount();
                                for (int i8 = 0; i8 < itemCount; i8++) {
                                    ClipData.Item itemAt = clipData.getItemAt(i8);
                                    CharSequence text = itemAt.getText();
                                    if (text != null && (obj2 = text.toString()) != null && (m1875w3 = AbstractC1092mk.m1875w3(obj2)) != null) {
                                        c1362vb = m1875w3;
                                    } else {
                                        Uri uri = itemAt.getUri();
                                        if (uri != null && (m1648B3 = AbstractC1092mk.m1648B3(context, uri)) != null) {
                                            c1362vb = m1648B3;
                                        }
                                    }
                                }
                            }
                            Uri uri2 = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                            if (uri2 != null) {
                                c1362vb = AbstractC1092mk.m1648B3(context, uri2);
                                break;
                            }
                            Uri data = intent.getData();
                            if (data != null) {
                                c1362vb = AbstractC1092mk.m1648B3(context, data);
                                break;
                            }
                        }
                        if (c1362vb != null) {
                            interfaceC2425y03.setValue(c1362vb);
                            interfaceC2425y02.setValue("外部分享的 .conf 配置");
                            AbstractC1092mk.m1867v0(interfaceC2425y04, true);
                            interfaceC2425y0.setValue(EnumC1123nk.f6333k);
                        }
                        ((InterfaceC3277a) obj3).mo52a();
                    }
                    c1362vb = null;
                    if (c1362vb != null) {
                    }
                    ((InterfaceC3277a) obj3).mo52a();
                }
                return c1694m;
            default:
                AbstractC1793a0.m2972L(obj);
                float f8 = AbstractC1092mk.f5952h;
                if (((EnumC1123nk) interfaceC2425y03.getValue()) == EnumC1123nk.f6332j && (((Boolean) interfaceC2425y02.getValue()).booleanValue() || ((Boolean) interfaceC2425y04.getValue()).booleanValue())) {
                    AbstractC1092mk.m1742V0(context, (C3469p) parcelable, interfaceC2425y0, ((Boolean) interfaceC2425y04.getValue()).booleanValue());
                    ((InterfaceC2425y0) obj3).setValue(Boolean.TRUE);
                }
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0713ai(Intent intent, Context context, InterfaceC3277a interfaceC3277a, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f2415o = intent;
        this.f2413m = context;
        this.f2416p = interfaceC3277a;
        this.f2410j = interfaceC2425y0;
        this.f2411k = interfaceC2425y02;
        this.f2412l = interfaceC2425y03;
        this.f2414n = interfaceC2425y04;
    }
}
