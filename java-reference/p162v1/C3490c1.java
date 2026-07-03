package p162v1;

import java.util.HashSet;
import p077k.C2182b0;
import p085l0.C2388n0;
import p101n0.C2705e;
import p139s1.AbstractC3088a;
import p158u5.AbstractC3367j;
import p170w1.C3710o1;
import p177x0.AbstractC3809q;
import p177x0.InterfaceC3808p;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.c1 */
/* loaded from: classes.dex */
public final class C3490c1 {

    /* renamed from: a */
    public final C3502g0 f16797a;

    /* renamed from: b */
    public final C3486b1 f16798b;

    /* renamed from: c */
    public final C3537s f16799c;

    /* renamed from: d */
    public AbstractC3497e1 f16800d;

    /* renamed from: e */
    public final C3557y1 f16801e;

    /* renamed from: f */
    public AbstractC3809q f16802f;

    /* renamed from: g */
    public C2705e f16803g;

    /* renamed from: h */
    public C2705e f16804h;

    /* renamed from: i */
    public final C2705e f16805i;

    /* renamed from: j */
    public C3482a1 f16806j;

    /* JADX WARN: Type inference failed for: r0v0, types: [v1.b1, x0.q] */
    public C3490c1(C3502g0 c3502g0) {
        this.f16797a = c3502g0;
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f17995h = -1;
        this.f16798b = abstractC3809q;
        C3537s c3537s = new C3537s(c3502g0);
        this.f16799c = c3537s;
        this.f16800d = c3537s;
        C3557y1 c3557y1 = c3537s.f17011T;
        this.f16801e = c3557y1;
        this.f16802f = c3557y1;
        this.f16805i = new C2705e(new InterfaceC3810r[16]);
    }

    /* renamed from: a */
    public static final void m5304a(C3490c1 c3490c1, AbstractC3809q abstractC3809q, AbstractC3497e1 abstractC3497e1) {
        C3537s c3537s;
        for (AbstractC3809q abstractC3809q2 = abstractC3809q.f17996i; abstractC3809q2 != null; abstractC3809q2 = abstractC3809q2.f17996i) {
            if (abstractC3809q2 == c3490c1.f16798b) {
                C3502g0 m5447u = c3490c1.f16797a.m5447u();
                if (m5447u != null) {
                    c3537s = m5447u.f16872I.f16799c;
                } else {
                    c3537s = null;
                }
                abstractC3497e1.f16849u = c3537s;
                c3490c1.f16800d = abstractC3497e1;
                return;
            }
            if ((abstractC3809q2.f17994g & 2) == 0) {
                abstractC3809q2.mo5482J0(abstractC3497e1);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [v1.c, x0.q] */
    /* renamed from: b */
    public static AbstractC3809q m5305b(InterfaceC3808p interfaceC3808p, AbstractC3809q abstractC3809q) {
        AbstractC3809q abstractC3809q2;
        if (interfaceC3808p instanceof AbstractC3556y0) {
            abstractC3809q2 = ((AbstractC3556y0) interfaceC3808p).mo312h();
            abstractC3809q2.f17994g = AbstractC3500f1.m5392f(abstractC3809q2);
        } else {
            ?? abstractC3809q3 = new AbstractC3809q();
            abstractC3809q3.f17994g = AbstractC3500f1.m5390d(interfaceC3808p);
            abstractC3809q3.f16788s = interfaceC3808p;
            abstractC3809q3.f16790u = new HashSet();
            abstractC3809q2 = abstractC3809q3;
        }
        if (abstractC3809q2.f18005r) {
            AbstractC3088a.m4750b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        abstractC3809q2.f18000m = true;
        AbstractC3809q abstractC3809q4 = abstractC3809q.f17997j;
        if (abstractC3809q4 != null) {
            abstractC3809q4.f17996i = abstractC3809q2;
            abstractC3809q2.f17997j = abstractC3809q4;
        }
        abstractC3809q.f17997j = abstractC3809q2;
        abstractC3809q2.f17996i = abstractC3809q;
        return abstractC3809q2;
    }

    /* renamed from: c */
    public static AbstractC3809q m5306c(AbstractC3809q abstractC3809q) {
        boolean z7 = abstractC3809q.f18005r;
        if (z7) {
            C2182b0 c2182b0 = AbstractC3500f1.f16858a;
            if (!z7) {
                AbstractC3088a.m4750b("autoInvalidateRemovedNode called on unattached node");
            }
            AbstractC3500f1.m5387a(abstractC3809q, -1, 2);
            abstractC3809q.mo5480H0();
            abstractC3809q.mo5477B0();
        }
        AbstractC3809q abstractC3809q2 = abstractC3809q.f17997j;
        AbstractC3809q abstractC3809q3 = abstractC3809q.f17996i;
        if (abstractC3809q2 != null) {
            abstractC3809q2.f17996i = abstractC3809q3;
            abstractC3809q.f17997j = null;
        }
        if (abstractC3809q3 != null) {
            abstractC3809q3.f17997j = abstractC3809q2;
            abstractC3809q.f17996i = null;
        }
        AbstractC3367j.m5097b(abstractC3809q3);
        return abstractC3809q3;
    }

    /* renamed from: h */
    public static void m5307h(InterfaceC3808p interfaceC3808p, InterfaceC3808p interfaceC3808p2, AbstractC3809q abstractC3809q) {
        if ((interfaceC3808p instanceof AbstractC3556y0) && (interfaceC3808p2 instanceof AbstractC3556y0)) {
            AbstractC3367j.m5098c(abstractC3809q, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((AbstractC3556y0) interfaceC3808p2).mo313i(abstractC3809q);
            if (abstractC3809q.f18005r) {
                AbstractC3500f1.m5389c(abstractC3809q);
                return;
            } else {
                abstractC3809q.f18001n = true;
                return;
            }
        }
        if (abstractC3809q instanceof C3488c) {
            C3488c c3488c = (C3488c) abstractC3809q;
            if (c3488c.f18005r) {
                c3488c.m5298L0();
            }
            c3488c.f16788s = interfaceC3808p2;
            c3488c.f17994g = AbstractC3500f1.m5390d(interfaceC3808p2);
            if (c3488c.f18005r) {
                c3488c.m5297K0(false);
            }
            if (abstractC3809q.f18005r) {
                AbstractC3500f1.m5389c(abstractC3809q);
                return;
            } else {
                abstractC3809q.f18001n = true;
                return;
            }
        }
        AbstractC3088a.m4750b("Unknown Modifier.Node type");
    }

    /* renamed from: d */
    public final boolean m5308d(int i7) {
        if ((i7 & this.f16802f.f17995h) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m5309e() {
        for (AbstractC3809q abstractC3809q = this.f16802f; abstractC3809q != null; abstractC3809q = abstractC3809q.f17997j) {
            abstractC3809q.mo5479G0();
            if (abstractC3809q.f18000m) {
                C2182b0 c2182b0 = AbstractC3500f1.f16858a;
                if (!abstractC3809q.f18005r) {
                    AbstractC3088a.m4750b("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC3500f1.m5387a(abstractC3809q, -1, 1);
            }
            if (abstractC3809q.f18001n) {
                AbstractC3500f1.m5389c(abstractC3809q);
            }
            abstractC3809q.f18000m = false;
            abstractC3809q.f18001n = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018f, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0194, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x019e, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a0, code lost:
    
        if (r11 <= r15) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a2, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r0.m5296a(r14 - 1, r27 - 1) == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b0, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bb, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bf, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c1, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c3, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c5, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cb, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cd, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0262, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0192, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018b, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0179, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0177, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0268, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0152, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0150, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0154, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0155, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0157, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0159, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0169, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016e, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0180, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0186, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0188, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018d, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5310f(int i7, C2705e c2705e, C2705e c2705e2, AbstractC3809q abstractC3809q, boolean z7) {
        int i8;
        C2705e c2705e3;
        C2705e c2705e4;
        int i9;
        int[] iArr;
        int[] iArr2;
        int i10;
        char c7;
        char c8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        C3482a1 c3482a1 = this.f16806j;
        if (c3482a1 == null) {
            i8 = i7;
            c2705e3 = c2705e;
            c2705e4 = c2705e2;
            c3482a1 = new C3482a1(this, abstractC3809q, i8, c2705e3, c2705e4, z7);
            this.f16806j = c3482a1;
        } else {
            i8 = i7;
            c2705e3 = c2705e;
            c2705e4 = c2705e2;
            c3482a1.f16776a = abstractC3809q;
            c3482a1.f16777b = i8;
            c3482a1.f16778c = c2705e3;
            c3482a1.f16779d = c2705e4;
            c3482a1.f16780e = z7;
        }
        C3490c1 c3490c1 = c3482a1.f16781f;
        int i22 = c2705e3.f14519g - i8;
        int i23 = c2705e4.f14519g - i8;
        char c9 = 2;
        int i24 = ((i22 + i23) + 1) / 2;
        C2388n0 c2388n0 = new C2388n0(i24 * 3);
        C2388n0 c2388n02 = new C2388n0(i24 * 4);
        int i25 = 0;
        c2388n02.m3825e(0, i22, 0, i23);
        int i26 = (i24 * 2) + 1;
        int[] iArr3 = new int[i26];
        int[] iArr4 = new int[i26];
        int[] iArr5 = new int[5];
        while (true) {
            int i27 = c2388n02.f13459b;
            if (i27 == 0) {
                break;
            }
            char c10 = c9;
            int[] iArr6 = c2388n02.f13458a;
            int i28 = i25;
            int i29 = i27 - 1;
            c2388n02.f13459b = i29;
            int i30 = iArr6[i29];
            int i31 = i27 - 2;
            c2388n02.f13459b = i31;
            int i32 = iArr6[i31];
            int i33 = i27 - 3;
            c2388n02.f13459b = i33;
            int i34 = iArr6[i33];
            int i35 = i27 - 4;
            c2388n02.f13459b = i35;
            int i36 = iArr6[i35];
            int i37 = i34 - i36;
            int i38 = i26;
            int i39 = i30 - i32;
            int[] iArr7 = iArr3;
            if (i37 >= 1 && i39 >= 1) {
                int i40 = 1;
                int i41 = ((i37 + i39) + 1) / 2;
                int i42 = i38 / 2;
                int i43 = i42 + 1;
                iArr7[i43] = i36;
                iArr4[i43] = i34;
                int i44 = i28;
                while (i44 < i41) {
                    int i45 = i37 - i39;
                    int i46 = i41;
                    iArr = iArr4;
                    if ((Math.abs(i45) & 1) == i40) {
                        i10 = 1;
                    } else {
                        i10 = i28;
                    }
                    int i47 = -i44;
                    int i48 = i10;
                    int i49 = i47;
                    while (true) {
                        if (i49 > i44) {
                            break;
                        }
                        if (i49 != i47) {
                            if (i49 != i44) {
                                i15 = i49;
                                iArr2 = iArr5;
                            } else {
                                i15 = i49;
                                iArr2 = iArr5;
                            }
                            i16 = iArr7[(i15 - 1) + i42];
                            i17 = i16 + 1;
                            int i50 = ((i17 - i36) + i32) - i15;
                            if (i44 == 0) {
                                i18 = 1;
                            } else {
                                i18 = i28;
                            }
                            if (i17 != i16) {
                                i19 = 1;
                            } else {
                                i19 = i28;
                            }
                            int i51 = i50 - (i18 & i19);
                            int i52 = i16;
                            i20 = i50;
                            while (i17 < i34 && i20 < i30 && c3482a1.m5296a(i17, i20)) {
                                i17++;
                                i20++;
                            }
                            iArr7[i42 + i15] = i17;
                            if (i48 == 0) {
                                int i53 = i20;
                                int i54 = i45 - i15;
                                i21 = i37;
                                if (i54 >= i47 + 1 && i54 <= i44 - 1 && iArr[i42 + i54] <= i17) {
                                    iArr2[i28] = i52;
                                    iArr2[1] = i51;
                                    iArr2[c10] = i17;
                                    iArr2[3] = i53;
                                    iArr2[4] = i28;
                                    c7 = 1;
                                    break;
                                }
                            } else {
                                i21 = i37;
                            }
                            i49 = i15 + 2;
                            iArr5 = iArr2;
                            i37 = i21;
                        } else {
                            i15 = i49;
                            iArr2 = iArr5;
                        }
                        i16 = iArr7[i15 + 1 + i42];
                        i17 = i16;
                        int i502 = ((i17 - i36) + i32) - i15;
                        if (i44 == 0) {
                        }
                        if (i17 != i16) {
                        }
                        int i512 = i502 - (i18 & i19);
                        int i522 = i16;
                        i20 = i502;
                        while (i17 < i34) {
                            i17++;
                            i20++;
                        }
                        iArr7[i42 + i15] = i17;
                        if (i48 == 0) {
                        }
                        i49 = i15 + 2;
                        iArr5 = iArr2;
                        i37 = i21;
                    }
                    if (Math.min(iArr2[c10] - iArr2[i28], iArr2[3] - iArr2[c7]) > 0) {
                        int i55 = iArr2[i28];
                        int i56 = iArr2[c7];
                        int i57 = iArr2[3] - i56;
                        int i58 = iArr2[c10] - i55;
                        if (i57 != i58) {
                            i58 = Math.min(i58, i57);
                            int i59 = iArr2[4];
                            if (i59 != 0) {
                                i11 = 1;
                            } else {
                                i11 = i28;
                            }
                            int i60 = iArr2[3];
                            c8 = 1;
                            int i61 = iArr2[1];
                            int i62 = i60 - i61;
                            int i63 = iArr2[c10];
                            int i64 = iArr2[i28];
                            if (i62 > i63 - i64) {
                                i12 = 1;
                            } else {
                                i12 = i28;
                            }
                            int i65 = i55 + ((i12 | i11) ^ 1);
                            if (i59 != 0) {
                                i13 = 1;
                            } else {
                                i13 = i28;
                            }
                            if (i60 - i61 > i63 - i64) {
                                i14 = 1;
                            } else {
                                i14 = i28;
                            }
                            i56 += ((i14 ^ 1) | i13) ^ 1;
                            i55 = i65;
                        } else {
                            c8 = 1;
                        }
                        c2388n0.m3824d(i55, i56, i58);
                    } else {
                        c8 = c7;
                    }
                    c2388n02.m3825e(i36, iArr2[i28], i32, iArr2[c8]);
                    c2388n02.m3825e(iArr2[c10], i34, iArr2[3], i30);
                    c9 = c10;
                    i25 = i28;
                    i26 = i38;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c9 = c10;
            i25 = i28;
            i26 = i38;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i66 = i25;
        int i67 = c2388n0.f13459b;
        if (i67 % 3 != 0) {
            AbstractC3088a.m4750b("Array size not a multiple of 3");
        }
        if (i67 > 3) {
            i9 = i66;
            c2388n0.m3826f(i9, i67 - 3);
        } else {
            i9 = i66;
        }
        c2388n0.m3824d(i22, i23, i9);
        int i68 = i9;
        int i69 = i68;
        int i70 = i69;
        while (i68 < c2388n0.f13459b) {
            int[] iArr8 = c2388n0.f13458a;
            int i71 = iArr8[i68];
            int i72 = iArr8[i68 + 2];
            int i73 = i71 - i72;
            int i74 = iArr8[i68 + 1] - i72;
            i68 += 3;
            while (i69 < i73) {
                AbstractC3809q abstractC3809q2 = c3482a1.f16776a.f17997j;
                AbstractC3367j.m5097b(abstractC3809q2);
                if ((abstractC3809q2.f17994g & 2) != 0) {
                    AbstractC3497e1 abstractC3497e1 = abstractC3809q2.f17999l;
                    AbstractC3367j.m5097b(abstractC3497e1);
                    AbstractC3497e1 abstractC3497e12 = abstractC3497e1.f16849u;
                    AbstractC3497e1 abstractC3497e13 = abstractC3497e1.f16848t;
                    AbstractC3367j.m5097b(abstractC3497e13);
                    if (abstractC3497e12 != null) {
                        abstractC3497e12.f16848t = abstractC3497e13;
                    }
                    abstractC3497e13.f16849u = abstractC3497e12;
                    m5304a(c3490c1, c3482a1.f16776a, abstractC3497e13);
                }
                c3482a1.f16776a = m5306c(abstractC3809q2);
                i69++;
            }
            while (i70 < i74) {
                AbstractC3809q m5305b = m5305b((InterfaceC3808p) c3482a1.f16779d.f14517e[c3482a1.f16777b + i70], c3482a1.f16776a);
                c3482a1.f16776a = m5305b;
                if (c3482a1.f16780e) {
                    AbstractC3809q abstractC3809q3 = m5305b.f17997j;
                    AbstractC3367j.m5097b(abstractC3809q3);
                    AbstractC3497e1 abstractC3497e14 = abstractC3809q3.f17999l;
                    AbstractC3367j.m5097b(abstractC3497e14);
                    InterfaceC3549w m5367g = AbstractC3498f.m5367g(c3482a1.f16776a);
                    if (m5367g != null) {
                        C3555y c3555y = new C3555y(c3490c1.f16797a, m5367g);
                        c3482a1.f16776a.mo5482J0(c3555y);
                        m5304a(c3490c1, c3482a1.f16776a, c3555y);
                        c3555y.f16849u = abstractC3497e14.f16849u;
                        c3555y.f16848t = abstractC3497e14;
                        abstractC3497e14.f16849u = c3555y;
                    } else {
                        c3482a1.f16776a.mo5482J0(abstractC3497e14);
                    }
                    c3482a1.f16776a.mo5476A0();
                    c3482a1.f16776a.mo5479G0();
                    AbstractC3809q abstractC3809q4 = c3482a1.f16776a;
                    C2182b0 c2182b0 = AbstractC3500f1.f16858a;
                    if (!abstractC3809q4.f18005r) {
                        AbstractC3088a.m4750b("autoInvalidateInsertedNode called on unattached node");
                    }
                    AbstractC3500f1.m5387a(abstractC3809q4, -1, 1);
                } else {
                    m5305b.f18000m = true;
                }
                i70++;
            }
            while (true) {
                int i75 = i72 - 1;
                if (i72 > 0) {
                    AbstractC3809q abstractC3809q5 = c3482a1.f16776a.f17997j;
                    AbstractC3367j.m5097b(abstractC3809q5);
                    c3482a1.f16776a = abstractC3809q5;
                    C2705e c2705e5 = c3482a1.f16778c;
                    int i76 = c3482a1.f16777b;
                    InterfaceC3808p interfaceC3808p = (InterfaceC3808p) c2705e5.f14517e[i76 + i69];
                    InterfaceC3808p interfaceC3808p2 = (InterfaceC3808p) c3482a1.f16779d.f14517e[i76 + i70];
                    if (!AbstractC3367j.m5096a(interfaceC3808p, interfaceC3808p2)) {
                        m5307h(interfaceC3808p, interfaceC3808p2, c3482a1.f16776a);
                    }
                    i69++;
                    i70++;
                    i72 = i75;
                }
            }
        }
        int i77 = i9;
        for (AbstractC3809q abstractC3809q6 = this.f16801e.f17996i; abstractC3809q6 != null && abstractC3809q6 != this.f16798b; abstractC3809q6 = abstractC3809q6.f17996i) {
            i77 |= abstractC3809q6.f17994g;
            abstractC3809q6.f17995h = i77;
        }
    }

    /* renamed from: g */
    public final void m5311g() {
        C3502g0 c3502g0;
        C3537s c3537s;
        C3555y c3555y;
        AbstractC3809q abstractC3809q = this.f16801e.f17996i;
        AbstractC3497e1 abstractC3497e1 = this.f16799c;
        AbstractC3809q abstractC3809q2 = abstractC3809q;
        while (true) {
            c3502g0 = this.f16797a;
            if (abstractC3809q2 == null) {
                break;
            }
            InterfaceC3549w m5367g = AbstractC3498f.m5367g(abstractC3809q2);
            if (m5367g != null) {
                AbstractC3497e1 abstractC3497e12 = abstractC3809q2.f17999l;
                if (abstractC3497e12 != null) {
                    C3555y c3555y2 = (C3555y) abstractC3497e12;
                    InterfaceC3549w interfaceC3549w = c3555y2.f17104T;
                    c3555y2.m5536y1(m5367g);
                    c3555y = c3555y2;
                    if (interfaceC3549w != abstractC3809q2) {
                        InterfaceC3521m1 interfaceC3521m1 = c3555y2.f16845M;
                        c3555y = c3555y2;
                        if (interfaceC3521m1 != null) {
                            ((C3710o1) interfaceC3521m1).invalidate();
                            c3555y = c3555y2;
                        }
                    }
                } else {
                    C3555y c3555y3 = new C3555y(c3502g0, m5367g);
                    abstractC3809q2.mo5482J0(c3555y3);
                    c3555y = c3555y3;
                }
                abstractC3497e1.f16849u = c3555y;
                c3555y.f16848t = abstractC3497e1;
                abstractC3497e1 = c3555y;
            } else {
                abstractC3809q2.mo5482J0(abstractC3497e1);
            }
            abstractC3809q2 = abstractC3809q2.f17996i;
        }
        C3502g0 m5447u = c3502g0.m5447u();
        if (m5447u != null) {
            c3537s = m5447u.f16872I.f16799c;
        } else {
            c3537s = null;
        }
        abstractC3497e1.f16849u = c3537s;
        this.f16800d = abstractC3497e1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        AbstractC3809q abstractC3809q = this.f16802f;
        C3557y1 c3557y1 = this.f16801e;
        if (abstractC3809q != c3557y1) {
            while (true) {
                if (abstractC3809q == null || abstractC3809q == c3557y1) {
                    break;
                }
                sb.append(String.valueOf(abstractC3809q));
                if (abstractC3809q.f17997j == c3557y1) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                abstractC3809q = abstractC3809q.f17997j;
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString(...)");
        return sb2;
    }
}
