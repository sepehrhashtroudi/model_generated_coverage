var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":99,"id":34011,"methods":[{"el":77,"sc":1,"sl":75},{"el":88,"sc":1,"sl":80}],"name":"TestIgnorePropsForSerialization","sl":9},{"el":26,"id":34011,"methods":[{"el":24,"sc":9,"sl":24},{"el":25,"sc":9,"sl":25}],"name":"TestIgnorePropsForSerialization.IgnoreSome","sl":19},{"el":30,"id":34015,"methods":[],"name":"TestIgnorePropsForSerialization.MyMap","sl":30},{"el":37,"id":34015,"methods":[],"name":"TestIgnorePropsForSerialization.WrapperWithPropIgnore","sl":33},{"el":42,"id":34015,"methods":[],"name":"TestIgnorePropsForSerialization.XY","sl":39},{"el":48,"id":34015,"methods":[],"name":"TestIgnorePropsForSerialization.WrapperWithPropIgnore2","sl":44},{"el":55,"id":34015,"methods":[],"name":"TestIgnorePropsForSerialization.XYZ","sl":51},{"el":64,"id":34015,"methods":[{"el":63,"sc":9,"sl":60}],"name":"TestIgnorePropsForSerialization.MapWrapper","sl":57}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_406":{"methods":[{"sl":80}],"name":"testExplicitIgnoralWithMap580","pass":true,"statements":[{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87}]},"test_435":{"methods":[{"sl":75}],"name":"testIgnoreViaPropsAndClass193","pass":true,"statements":[{"sl":76}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [435], [435], [], [], [], [406], [406], [406], [406], [406], [406], [406], [406], [], [], [], [], [], [], [], [], [], [], [], []]
