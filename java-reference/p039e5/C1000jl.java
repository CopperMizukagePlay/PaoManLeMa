package p039e5;

import android.net.Network;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.jl */
/* loaded from: classes.dex */
public final class C1000jl extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public List f5090i;

    /* renamed from: j */
    public List f5091j;

    /* renamed from: k */
    public Throwable f5092k;

    /* renamed from: l */
    public Iterator f5093l;

    /* renamed from: m */
    public EnumC0748bl f5094m;

    /* renamed from: n */
    public Iterator f5095n;

    /* renamed from: o */
    public EnumC1402wk f5096o;

    /* renamed from: p */
    public Iterator f5097p;

    /* renamed from: q */
    public C0812dl f5098q;

    /* renamed from: r */
    public int f5099r;

    /* renamed from: s */
    public final /* synthetic */ C1031kl f5100s;

    /* renamed from: t */
    public final /* synthetic */ EnumC1495zk f5101t;

    /* renamed from: u */
    public final /* synthetic */ EnumC1402wk f5102u;

    /* renamed from: v */
    public final /* synthetic */ List f5103v;

    /* renamed from: w */
    public final /* synthetic */ ArrayList f5104w;

    /* renamed from: x */
    public final /* synthetic */ Network f5105x;

    /* renamed from: y */
    public final /* synthetic */ C1405wn f5106y;

    /* renamed from: z */
    public final /* synthetic */ int f5107z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1000jl(C1031kl c1031kl, EnumC1495zk enumC1495zk, EnumC1402wk enumC1402wk, List list, ArrayList arrayList, Network network, C1405wn c1405wn, int i7, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f5100s = c1031kl;
        this.f5101t = enumC1495zk;
        this.f5102u = enumC1402wk;
        this.f5103v = list;
        this.f5104w = arrayList;
        this.f5105x = network;
        this.f5106y = c1405wn;
        this.f5107z = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1000jl) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1000jl(this.f5100s, this.f5101t, this.f5102u, this.f5103v, this.f5104w, this.f5105x, this.f5106y, this.f5107z, interfaceC2313c);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x004f: MOVE (r34 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:80), block:B:378:0x004b */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x005f: MOVE (r9 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:96), block:B:378:0x004b */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x005d: MOVE (r13 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:94), block:B:378:0x004b */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0531 A[Catch: all -> 0x057c, TRY_LEAVE, TryCatch #19 {all -> 0x057c, blocks: (B:157:0x051d, B:160:0x0531), top: B:156:0x051d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0146 A[Catch: all -> 0x010d, CancellationException -> 0x0111, TryCatch #37 {CancellationException -> 0x0111, all -> 0x010d, blocks: (B:16:0x0140, B:18:0x0146, B:20:0x0158, B:22:0x0166, B:24:0x017b, B:29:0x0183, B:31:0x0193, B:33:0x01a5, B:35:0x01b3, B:41:0x01b9, B:10:0x0124, B:12:0x012a, B:14:0x013a, B:6:0x00f5, B:8:0x0100, B:9:0x0119, B:352:0x0115), top: B:5:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0253 A[Catch: all -> 0x0227, CancellationException -> 0x022b, TRY_LEAVE, TryCatch #39 {CancellationException -> 0x022b, all -> 0x0227, blocks: (B:47:0x0213, B:70:0x0235, B:71:0x024d, B:73:0x0253), top: B:46:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x07fc A[Catch: all -> 0x0762, CancellationException -> 0x0765, TryCatch #40 {CancellationException -> 0x0765, all -> 0x0762, blocks: (B:81:0x07e9, B:79:0x07fc, B:169:0x074d, B:171:0x0751, B:173:0x0757, B:175:0x0768, B:178:0x07ba, B:344:0x085e, B:346:0x0865, B:348:0x0893, B:350:0x08a4, B:351:0x08ac), top: B:80:0x07e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x07e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44, types: [e5.kl] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [e5.kl, e5.jl] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43, types: [e5.jl, k5.c] */
    /* JADX WARN: Type inference failed for: r6v60, types: [e5.jl] */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 8 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 12 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 15 */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo29m(java.lang.Object r55) {
        /*
            Method dump skipped, instructions count: 2422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p039e5.C1000jl.mo29m(java.lang.Object):java.lang.Object");
    }
}
