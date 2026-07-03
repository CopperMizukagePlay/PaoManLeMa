package p170w1;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p039e5.C0721aq;
import p068i5.AbstractC2080d;
import p069i6.AbstractC2100m;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.i0 */
/* loaded from: classes.dex */
public final class C3685i0 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: A */
    public static final C3685i0 f17539A;

    /* renamed from: B */
    public static final C3685i0 f17540B;

    /* renamed from: C */
    public static final C3685i0 f17541C;

    /* renamed from: D */
    public static final C3685i0 f17542D;

    /* renamed from: E */
    public static final C3685i0 f17543E;

    /* renamed from: F */
    public static final C3685i0 f17544F;

    /* renamed from: G */
    public static final C3685i0 f17545G;

    /* renamed from: H */
    public static final C3685i0 f17546H;

    /* renamed from: I */
    public static final C3685i0 f17547I;

    /* renamed from: g */
    public static final C3685i0 f17548g;

    /* renamed from: h */
    public static final C3685i0 f17549h;

    /* renamed from: i */
    public static final C3685i0 f17550i;

    /* renamed from: j */
    public static final C3685i0 f17551j;

    /* renamed from: k */
    public static final C3685i0 f17552k;

    /* renamed from: l */
    public static final C3685i0 f17553l;

    /* renamed from: m */
    public static final C3685i0 f17554m;

    /* renamed from: n */
    public static final C3685i0 f17555n;

    /* renamed from: o */
    public static final C3685i0 f17556o;

    /* renamed from: p */
    public static final C3685i0 f17557p;

    /* renamed from: q */
    public static final C3685i0 f17558q;

    /* renamed from: r */
    public static final C3685i0 f17559r;

    /* renamed from: s */
    public static final C3685i0 f17560s;

    /* renamed from: t */
    public static final C3685i0 f17561t;

    /* renamed from: u */
    public static final C3685i0 f17562u;

    /* renamed from: v */
    public static final C3685i0 f17563v;

    /* renamed from: w */
    public static final C3685i0 f17564w;

    /* renamed from: x */
    public static final C3685i0 f17565x;

    /* renamed from: y */
    public static final C3685i0 f17566y;

    /* renamed from: z */
    public static final C3685i0 f17567z;

    /* renamed from: f */
    public final /* synthetic */ int f17568f;

    static {
        int i7 = 0;
        f17548g = new C3685i0(i7, 0);
        f17549h = new C3685i0(i7, 1);
        f17550i = new C3685i0(i7, 2);
        f17551j = new C3685i0(i7, 3);
        f17552k = new C3685i0(i7, 4);
        f17553l = new C3685i0(i7, 5);
        f17554m = new C3685i0(i7, 6);
        f17555n = new C3685i0(i7, 7);
        f17556o = new C3685i0(i7, 8);
        f17557p = new C3685i0(i7, 9);
        f17558q = new C3685i0(i7, 10);
        f17559r = new C3685i0(i7, 11);
        f17560s = new C3685i0(i7, 12);
        f17561t = new C3685i0(i7, 13);
        f17562u = new C3685i0(i7, 14);
        f17563v = new C3685i0(i7, 15);
        f17564w = new C3685i0(i7, 16);
        f17565x = new C3685i0(i7, 17);
        f17566y = new C3685i0(i7, 18);
        f17567z = new C3685i0(i7, 19);
        f17539A = new C3685i0(i7, 20);
        f17540B = new C3685i0(i7, 21);
        f17541C = new C3685i0(i7, 22);
        f17542D = new C3685i0(i7, 23);
        f17543E = new C3685i0(i7, 24);
        f17544F = new C3685i0(i7, 25);
        f17545G = new C3685i0(i7, 26);
        f17546H = new C3685i0(i7, 27);
        f17547I = new C3685i0(i7, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3685i0(int i7, int i8) {
        super(i7);
        this.f17568f = i8;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        Choreographer choreographer;
        InterfaceC2313c interfaceC2313c = null;
        switch (this.f17568f) {
            case 0:
                AndroidCompositionLocals_androidKt.m399b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.m399b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.m399b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.m399b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.m399b("LocalView");
                throw null;
            case AbstractC3122c.f15761f /* 5 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    C2325e c2325e = AbstractC0549l0.f1898a;
                    int i7 = 2;
                    choreographer = (Choreographer) AbstractC0525d0.m1145w(AbstractC2100m.f12376a, new C0721aq(i7, interfaceC2313c, i7));
                }
                C3717q0 c3717q0 = new C3717q0(choreographer, AbstractC3784a.m5801e(Looper.getMainLooper()));
                return AbstractC2080d.m3374B(c3717q0, c3717q0.f17674p);
            case AbstractC3122c.f15759d /* 6 */:
            case 7:
                return null;
            case 8:
                AbstractC3674f1.m5668b("LocalAutofillManager");
                throw null;
            case AbstractC3122c.f15758c /* 9 */:
                AbstractC3674f1.m5668b("LocalAutofillTree");
                throw null;
            case AbstractC3122c.f15760e /* 10 */:
                AbstractC3674f1.m5668b("LocalClipboard");
                throw null;
            case 11:
                AbstractC3674f1.m5668b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                AbstractC3674f1.m5668b("LocalDensity");
                throw null;
            case 14:
                AbstractC3674f1.m5668b("LocalFocusManager");
                throw null;
            case AbstractC3122c.f15762g /* 15 */:
                AbstractC3674f1.m5668b("LocalFontFamilyResolver");
                throw null;
            case 16:
                AbstractC3674f1.m5668b("LocalFontLoader");
                throw null;
            case 17:
                AbstractC3674f1.m5668b("LocalGraphicsContext");
                throw null;
            case 18:
                AbstractC3674f1.m5668b("LocalHapticFeedback");
                throw null;
            case 19:
                AbstractC3674f1.m5668b("LocalInputManager");
                throw null;
            case 20:
                AbstractC3674f1.m5668b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                AbstractC3674f1.m5668b("LocalTextToolbar");
                throw null;
            case 26:
                AbstractC3674f1.m5668b("LocalUriHandler");
                throw null;
            case 27:
                AbstractC3674f1.m5668b("LocalViewConfiguration");
                throw null;
            default:
                AbstractC3674f1.m5668b("LocalWindowInfo");
                throw null;
        }
    }
}
